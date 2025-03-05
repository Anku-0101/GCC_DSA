import javax.swing.plaf.LabelUI;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        WorkflowManager manager = new WorkflowManager();
        manager.registerUser("Alice");
        manager.registerUser("Bob");

        User alice = manager.getUser("Alice");
        alice.performAction(new CompleteKYCAction());
        alice.performAction(new MakeFirstPaymentAction());
    }
}

// Abstract Stage Handler (Chain of Responsibility)
abstract class StageHandler {
    protected StageHandler nextStage;

    public void setNextStage(StageHandler nextStage) {
        this.nextStage = nextStage;
    }

    public abstract boolean processAction(User user, Action action);
}

// Concrete Stage: KYC Pending
class KycPendingStage extends StageHandler {
    @Override
    public boolean processAction(User user, Action action) {
        if (action instanceof CompleteKYCAction) {
            System.out.println(user.name + " completed KYC. Moving to Verified User stage.");
            user.setCurrentStage(new VerifiedUserStage());
            return true;
        }
        return nextStage != null && nextStage.processAction(user, action);
    }
}

class VerifiedUserStage extends StageHandler {
    @Override
    public boolean processAction(User user, Action action) {
        if (action instanceof MakeFirstPaymentAction) {
            System.out.println(user.name + " made first payment. Moving to First Payment Complete stage.");
            user.setCurrentStage(new FirstPaymentCompleteStage());
            return true;
        }
        return nextStage != null && nextStage.processAction(user, action);
    }
}

// Concrete Stage: First Payment Complete
class FirstPaymentCompleteStage extends StageHandler {
    @Override
    public boolean processAction(User user, Action action) {
        System.out.println(user.name + " is now eligible for a new user coupon.");
        user.setCurrentStage(new NewUserCouponEligibleStage());
        return true;
    }
}

// Concrete Stage: New User Coupon Eligible
class NewUserCouponEligibleStage extends StageHandler {
    @Override
    public boolean processAction(User user, Action action) {
        System.out.println(user.name + " has already completed all stages.");
        return false;
    }
}

// Action Interface
interface Action {}

// Concrete Actions
class CompleteKYCAction implements Action {}
class MakeFirstPaymentAction implements Action {}

// User Class
class User {
    String name;
    StageHandler currentStage;

    public User(String name) {
        this.name = name;
        this.currentStage = new KycPendingStage(); // Start at KYC Pending
    }

    public void setCurrentStage(StageHandler newStage) {
        this.currentStage = newStage;
    }

    public void performAction(Action action) {
        currentStage.processAction(this, action);
    }
}

// Workflow Manager
class WorkflowManager {
    private final List<User> users = new ArrayList<>();

    public void registerUser(String name) {
        users.add(new User(name));
    }

    public User getUser(String name) {
        return users.stream().filter(u -> u.name.equals(name)).findFirst().orElse(null);
    }
}














