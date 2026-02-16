package InterviewQuestion.InventoryManagement;

import java.util.Map;

public class Order {
    User user;
    Addrees deliveryAddress;
    Map<Integer, Integer> productCategoryAndCountMap;
    Warehouse warehouse;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;

    Order(User user, Warehouse warehouse)
    {
        this.user = user;
        this.productCategoryAndCountMap = user.getUserCart().getCartItems();
        this.warehouse = warehouse;
        this.deliveryAddress = user.addrees;
        invoice = new Invoice();
        invoice.generateInvoice(this);
    }

    public void checkout()
    {
        warehouse.removeItemFromInventory(productCategoryAndCountMap);

        boolean isPaymentSuccess = makePayment(new UPIPaymentMode());

        //3. mark the cart as empty
        if(isPaymentSuccess){
            user.getUserCart().emptyCart();
        }else {
            warehouse.addItemToInventory(productCategoryAndCountMap);
        }
    }

    public boolean makePayment(PaymentMode upiPaymentMode) {
        payment = new Payment(upiPaymentMode);
        return payment.makePayment();
    }

    public void generateOrderInvoice()
    {
        invoice.generateInvoice(this);
    }



}
