package main.java.com.conceptcoding.structuralpatterns.facade;

public class ECommerceApp {
    public static void main(String args[]){
        System.out.println("======Facade Design Pattern Demo=====");
        //Client interacts with a simple facade, not all subsystems
        OrderFacade orderFacade = new OrderFacade();

        // place order with one call to Facade
        orderFacade.placeOrder("MacBook Pro", "Credit Card");
        // place another other with one call to Facade
        orderFacade.placeOrder("Cricket Bat", "UPI");
    }
}
