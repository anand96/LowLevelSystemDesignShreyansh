package main.java.com.conceptcoding.behavioralpatterns.command.solution;

import main.java.com.conceptcoding.behavioralpatterns.command.solution.AirConditioner;

public class TurnOffCommand implements ICommand {
    private final AirConditioner ac;
    private boolean previousState;

    public TurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        previousState = ac.isOn();
        ac.turnOff();
    }

    @Override
    public void undo() {
        System.out.println("Undo Turn Off Command");
        if(previousState)
        {
            ac.turnOn();
        }
    }
}
