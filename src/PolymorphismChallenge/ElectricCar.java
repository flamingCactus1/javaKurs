package PolymorphismChallenge;

public class ElectricCar extends Car {
    private int batteryCapacity;
    private double averageKmPerCharge;
    private int soundLevel;
    private int efficiencyFactor;

    public ElectricCar(String description, int batteryCapacity, double averageKmPerCharge, int soundLevel, int efficiencyFactor) {
        super(description);
        this.batteryCapacity = Math.max(batteryCapacity, 1);
        this.averageKmPerCharge = Math.max(averageKmPerCharge, 1);
        this.soundLevel = Math.max(soundLevel, 1);
        this.efficiencyFactor = Math.max(efficiencyFactor, 0);
    }

    public ElectricCar() {
        this("Just a normal electric car", 60, 450, 3, 75);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("The electric engine runs really clean and silent");
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Average Distance per Charge: " + averageKmPerCharge);
        System.out.println("Sound Level: " + soundLevel);
        System.out.println("Efficiency Factor: " + efficiencyFactor);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("The electric car drives and looks really cool");
    }
}
