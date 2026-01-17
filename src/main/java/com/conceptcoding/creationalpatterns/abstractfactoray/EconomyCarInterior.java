package main.java.com.conceptcoding.creationalpatterns.abstractfactoray;

// Step 2: Concrete Products for Economy Car Family
public class EconomyCarInterior implements CarInterior {
    @Override
    public void addInteriorComponents() {
        System.out.println("Adding basic interior components for Economy Car.");
    }
}


