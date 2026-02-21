package main.java.com.conceptcoding.behavioralpatterns.chainofresponsibility;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error: "+ message);
    }
}
