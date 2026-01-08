package PolymorphismChallenge;

public class GasCar extends Car {
    private int tankCapacity;
    private double averageKmPerLiter;
    private int cylinders;
    private String transmissionType;

    public GasCar(String description, int tankCapacity, double averageKmPerLiter, int cylinders, String transmissionType) {
        super(description);
        this.tankCapacity = Math.max(tankCapacity, 1);
        this.averageKmPerLiter = Math.max(averageKmPerLiter, 1);
        this.cylinders = Math.max(cylinders, 1);
        this.transmissionType = transmissionType.equalsIgnoreCase("Mechanic") ||
                transmissionType.equalsIgnoreCase("Automatic") ? transmissionType : "unknown";
    }

    public GasCar() {
        this("just a gas car", 30, 8, 4, "automatic");
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println("Tank Capacity: " + tankCapacity);
        System.out.println("Average Km per liter: " + averageKmPerLiter);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Transmission Type: " + transmissionType);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("The gasoline engine runs really loud and pollutes the air around");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Gasoline car drives around");
    }

    public void emitGases(){
        System.out.println("Gasoline car emits the gases");
    }
}
