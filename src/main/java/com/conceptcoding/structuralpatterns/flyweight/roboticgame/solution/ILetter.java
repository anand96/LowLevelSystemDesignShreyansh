package main.java.com.conceptcoding.structuralpatterns.flyweight.roboticgame.solution;

// Flyweight (Interface) - for the flyweight object – defines methods that use extrinsic state.
public interface ILetter {
    // The position(row,column) is extrinsic data - unique to each object
    void display(int row, int column);
}

