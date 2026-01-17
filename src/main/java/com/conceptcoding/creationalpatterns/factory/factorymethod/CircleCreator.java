package main.java.com.conceptcoding.creationalpatterns.factory.factorymethod;

import main.java.com.conceptcoding.creationalpatterns.factory.Circle;
import main.java.com.conceptcoding.creationalpatterns.factory.Shape;

// Step 4: Concrete Creator classes
public class CircleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}