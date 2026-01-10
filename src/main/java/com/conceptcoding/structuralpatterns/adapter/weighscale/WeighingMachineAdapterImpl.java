package main.java.com.conceptcoding.structuralpatterns.adapter.weighscale;

public class WeighingMachineAdapterImpl implements WeighingMachineAdapter{

    ImperialWeighingMachine imperialWeighingMachine;

    public WeighingMachineAdapterImpl(ImperialWeighingMachine weightMachineInPound){
        this.imperialWeighingMachine = weightMachineInPound;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound  = imperialWeighingMachine.getWeightInPound();
        return weightInPound * 45;
    }
}
