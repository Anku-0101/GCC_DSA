import javax.swing.plaf.LabelUI;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
    }
}

class Seller{
    private HashSet<String> serviceablePincodes;
    private HashSet<String> sellerPaymentModes;

    public Seller(List<String> servicablePincodes, List<String> sellerPaymentModes){
        this.serviceablePincodes = new HashSet<>();
        this.sellerPaymentModes = new HashSet<>();

        this.serviceablePincodes.addAll(servicablePincodes);
        this.sellerPaymentModes.addAll(sellerPaymentModes);
    }

    boolean servesPincode(String pincode){
        return pincode!=null && serviceablePincodes.contains(pincode);
    }
    boolean supportPaymentType(String paymentType){
        return paymentType!=null && sellerPaymentModes.contains(paymentType);
    }
}

class SellerManager{
    private ConcurrentHashMap<String, Seller> sellers;

    public SellerManager(){
        this.sellers = new ConcurrentHashMap<>();
    }
    public  void createSeller(String sellerId, List<String> serviceablePincodes, List<String> paymentModes){
        sellers.put(sellerId, new Seller(serviceablePincodes, paymentModes));
    }
    public Seller getSeller(String sellerId){
        return sellers.get(sellerId);
    }
}

class InventoryManager{
    // productId vs SellerId vs productCount
    ConcurrentHashMap<Integer, ConcurrentHashMap<String, AtomicInteger>> productInventory;

    public InventoryManager(){
        productInventory = new ConcurrentHashMap<>();
    }

    public int getInventory(int productId, String sellerId){
        if(!productInventory.containsKey(productId)){
            return 0;
        }
        ConcurrentHashMap<String, AtomicInteger> sellers = productInventory.get(productId);
        AtomicInteger existingInventory = sellers.get(sellerId);

        return existingInventory == null ? 0 : existingInventory.get();
    }

    public Boolean reduceInventory(int productId, String sellerId, int delta){
        if(!productInventory.containsKey(productId)){
            return false;
        }

        var existingInventory = productInventory.get(productId).get(sellerId);
        if(existingInventory == null){
           return false;
        }

        while(true){
            int currentValue = existingInventory.get();
            if(currentValue < delta)break;
            if(existingInventory.compareAndSet(currentValue, currentValue-delta)) return true;
        }
        return false;
    }
    public void addInventory(int productId, String sellerId, int delta){
        productInventory.putIfAbsent(productId, new ConcurrentHashMap<>());
        ConcurrentHashMap<String, AtomicInteger> sellers = productInventory.get(productId);
        sellers.putIfAbsent(sellerId, new AtomicInteger(0));

        AtomicInteger inventory = sellers.get(sellerId);
        inventory.addAndGet(delta);
    }
}

class Driver{
    private SellerManager sellerManager = new SellerManager();
    private InventoryManager inventoryManager = new InventoryManager();
    private int productsCount;

    public Driver(int productsCount){
        this.productsCount = productsCount;
    }

    public void createSeller(String sellerId, List<String> servicablePincodes, List<String> paymentModes){
        sellerManager.createSeller(sellerId, servicablePincodes, paymentModes);
    }

    public void  addInventory(int productId, String sellerId, int delta){
        inventoryManager.addInventory(productId, sellerId, delta);
    }

    public int getInventory(int productId, String sellerId){
        return inventoryManager.getInventory(productId, sellerId);
    }

    public String createOrder(String orderId, String destinationPincode, String sellerId, int productId, int productCount, String paymentMode){
        Seller seller = sellerManager.getSeller(sellerId);
        if(!seller.servesPincode(destinationPincode))return "pincode unserviceable";
        if(!seller.supportPaymentType(paymentMode))return "Payment mode not supported";
        boolean reduced = inventoryManager.reduceInventory(productId,sellerId,productCount);
        return reduced?"Order placed" : "insufficient product inventory";
    }
}
