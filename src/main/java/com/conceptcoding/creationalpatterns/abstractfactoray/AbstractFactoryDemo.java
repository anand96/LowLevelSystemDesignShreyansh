package main.java.com.conceptcoding.creationalpatterns.abstractfactoray;

// setp 7. client Application
public class AbstractFactoryDemo {
    public static void main(String args[])
    {
        System.out.println("=====Abstract Factory Design Pattern=====");

        // Get Factory Provider
        CarFactoryProvider carFactoryProvider = new CarFactoryProvider();

        // Get Economy Car Factory
        CarFactory economyCar = carFactoryProvider.getFactory(CarType.ECONOMY, "HONDA");
        economyCar.produceCompleteVehicle();

        // Get Luxury Car Factory
        CarFactory luxuryCar = carFactoryProvider.getFactory(CarType.LUXURY, "Mercedes");
        luxuryCar.produceCompleteVehicle();

        // Get Premium Car Factory
        CarFactory premiumFactory = carFactoryProvider.getFactory(CarType.PREMIUM, "Rolls Royce");
        premiumFactory.produceCompleteVehicle();
    }

}
