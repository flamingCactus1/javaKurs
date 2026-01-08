package PolymorphismChallenge;

public class HybridCar extends Car{
    private int tankCapacity;
    private int batteryCapacity;
    private int cylinders;
    private int efficiencyFactor;

    public HybridCar(String description, int tankCapacity, int batteryCapacity, int cylinders, int efficiencyFactor) {
        super(description);
        this.tankCapacity = Math.max(tankCapacity,1);
        this.batteryCapacity = Math.max(batteryCapacity,1);
        this.cylinders = Math.max(cylinders,1);
        this.efficiencyFactor = Math.max(efficiencyFactor,0);
    }

    public HybridCar() {
        this("Just a normal hybrid car", 10, 100, 1, 55);
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println("Tank Capacity: " + tankCapacity);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Efficiency Factor: " + efficiencyFactor);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Hybrid Car starts not so loud and pollutes the air not so much");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Hybrid Car drives around");
    }

    public void workFromTwoEngines(){
        System.out.println("Hybrid Car works from two engines");
    }
}
