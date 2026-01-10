package main.java.com.conceptcoding.structuralpatterns.facade;

// subsystem D : Notification
public class NotificationService {
    public void sendConformation(String productId){
        System.out.println("Sending order conformation for product:" + productId);
    }
}
