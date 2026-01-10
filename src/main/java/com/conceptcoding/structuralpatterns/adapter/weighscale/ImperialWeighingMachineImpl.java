package main.java.com.conceptcoding.structuralpatterns.adapter.weighscale;

public class ImperialWeighingMachineImpl implements ImperialWeighingMachine{

    double weightInPound=0;

    public ImperialWeighingMachineImpl(double weighingScaleReading){
        this.weightInPound = weighingScaleReading;
    }
    @Override
    public double getWeightInPound() {
        return weightInPound;
    }
}
