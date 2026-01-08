package PolymorphismChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Provide a type of car");
        System.out.printf(".. %s%n".repeat(3),
                "electric",
                "hybrid",
                "gas");
        System.out.print(">");
        String typeOfCar = input.nextLine();

        Car car = Car.createDefaulCar(typeOfCar);
        System.out.println(car.getClass().getSimpleName());
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
