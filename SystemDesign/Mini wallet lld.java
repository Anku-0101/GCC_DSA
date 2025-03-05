import javax.swing.plaf.LabelUI;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.registerUser("1", "Alice");
        userManager.registerUser("2", "Bob");

        User alice = userManager.getUser("1");
        User bob = userManager.getUser("2");

        alice.wallet.topUp(500);
        bob.wallet.topUp(200);

        OfferStrategy offer = new FirstTransactionCashback();
        alice.wallet.sendMoney(bob.wallet, 150, offer);

        System.out.println("Alice Balance: " + alice.wallet.getBalance());
        System.out.println("Bob Balance: " + bob.wallet.getBalance());
    }
}
class User {
    String id, name;
    Wallet wallet;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.wallet = new Wallet();
    }
}

class Wallet {
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public void topUp(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be greater than 0");
        balance += amount;
    }

    public boolean sendMoney(Wallet receiver, double amount, OfferStrategy strategy) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        receiver.balance += amount;

        Transaction transaction = new Transaction(this, receiver, amount);
        transactions.add(transaction);
        receiver.transactions.add(transaction);

        strategy.applyOffer(this, receiver, transaction);
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions(Comparator<Transaction> sorter, Filter<Transaction> filter) {
        return transactions.stream().filter(filter::apply).sorted(sorter).collect(Collectors.toList());
    }
}

class Transaction {
    Wallet sender, receiver;
    double amount;
    Date date;

    public Transaction(Wallet sender, Wallet receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.date = new Date();
    }
}

interface OfferStrategy {
    void applyOffer(Wallet sender, Wallet receiver, Transaction transaction);
}

class FirstTransactionCashback implements OfferStrategy {
    private Set<Wallet> firstTimeUsers = new HashSet<>();

    @Override
    public void applyOffer(Wallet sender, Wallet receiver, Transaction transaction) {
        if (!firstTimeUsers.contains(sender) && transaction.amount > 100) {
            sender.topUp(transaction.amount * 0.1);
            firstTimeUsers.add(sender);
        }
    }
}

class EqualBalanceCashback implements OfferStrategy {
    @Override
    public void applyOffer(Wallet sender, Wallet receiver, Transaction transaction) {
        if (sender.getBalance() == receiver.getBalance()) {
            sender.topUp(transaction.amount * 0.05);
        }
    }
}

class UserManager {
    Map<String, User> users = new HashMap<>();

    public void registerUser(String id, String name) {
        users.put(id, new User(id, name));
    }

    public User getUser(String id) {
        return users.get(id);
    }
}










