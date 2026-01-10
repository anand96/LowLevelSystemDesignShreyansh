package main.java.com.conceptcoding.structuralpatterns.facade;

// Facade hides complexity and provides a simple unified interface
public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    public OrderFacade(){
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    // Simplified method for clients
    public void placeOrder(String productId, String paymentMethod){
        // The following steps are hidden from the client and need to be executed in a specific order
        System.out.println("Placing order for product:" + productId);

        // Step 1. Check status
        if(!inventoryService.checkStock(productId)){
            System.out.println("Product out of stock!!!");
            return;
        }

        // Step 2: Make Payment
        if(!paymentService.makePayment(paymentMethod)) {
            System.out.println("Payment failed!");
            return;
        }

        // Step 3 : Ship Product
        shippingService.shipProduct(productId);

        // Step 4 : Send Conformation
        notificationService.sendConformation(productId);

        System.out.println("Order place Successfully");
    }
}