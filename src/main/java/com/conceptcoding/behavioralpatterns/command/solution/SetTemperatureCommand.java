package main.java.com.conceptcoding.behavioralpatterns.command.solution;

import main.java.com.conceptcoding.behavioralpatterns.command.solution.AirConditioner;

public class SetTemperatureCommand implements ICommand{
    private final AirConditioner ac;
    private final int newTemperature;
    private int previousTemperature;

    public SetTemperatureCommand(AirConditioner ac, int temperature) {
        this.ac = ac;
        this.newTemperature = temperature;
    }

    @Override
    public void execute() {
        previousTemperature = ac.getTemperature();
        ac.setTemperature(newTemperature);
    }

    @Override
    public void undo() {
        System.out.println("Undo: Set Temperature Command. ");
        ac.setTemperature(previousTemperature);
    }
}
