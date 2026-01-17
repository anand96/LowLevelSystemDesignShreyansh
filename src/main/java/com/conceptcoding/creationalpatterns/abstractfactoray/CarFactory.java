package main.java.com.conceptcoding.creationalpatterns.abstractfactoray;

public interface CarFactory {

    //Factory methods
    CarInterior createInterior();
    CarExterior createExterior();

    // Template method that uses all factory methods
    default void produceCompleteVehicle(){

        System.out.println("Starting complete vehicle production...");

        // Create all components
        CarInterior carInterior = createInterior();
        CarExterior carExterior = createExterior();

        // assemble the vehicle
        carInterior.addInteriorComponents();
        carExterior.addExteriorComponents();

        System.out.println("Vehicle production completed!");
    }
}
