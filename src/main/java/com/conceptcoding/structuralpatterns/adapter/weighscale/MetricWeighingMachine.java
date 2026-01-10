package main.java.com.conceptcoding.structuralpatterns.adapter.weighscale;

public class MetricWeighingMachine {

    public static void main(String args[]){
        System.out.println("==== Adapter Design Patter ======");

        double weighingMachineReading  = 25.0;
        ImperialWeighingMachineImpl imperialWeighingMachine = new ImperialWeighingMachineImpl(weighingMachineReading);

        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(imperialWeighingMachine);

        System.out.println("Weight in KG : "+  weighingMachineAdapter.getWeightInKg());
    }
}
