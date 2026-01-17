package main.java.com.conceptcoding.creationalpatterns.abstractfactoray;

enum CarType {
    ECONOMY,
    LUXURY,
    PREMIUM;
}

public class CarFactoryProvider {

    public CarFactory getFactory(CarType carType, String brand){
        switch (carType) {
            case ECONOMY:
                return new EconomyCarFactory(brand);
            case PREMIUM:
            case LUXURY:
                return new LuxuryCarFactory(brand);
            default:
                throw new IllegalArgumentException("Unknown car type: " + carType);
        }

    }
}
