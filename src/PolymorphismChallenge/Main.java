package PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {

        Car car = Car.createDefaultCar();
        car.showStats();
        car.start();
        car.drive();
        car.stop();
        if (car instanceof ElectricCar electricCar) {
            electricCar.beCool();
        } else if (car instanceof HybridCar hybridCar) {
            hybridCar.workFromTwoEngines();
        } else if (car instanceof GasCar gasCar) {
            gasCar.emitGases();
        }

    }
}
