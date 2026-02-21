package main.java.com.conceptcoding.behavioralpatterns.command.problem;

public class Bulb {
    boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("Bulb is On");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Bulb is off");
    }
}
