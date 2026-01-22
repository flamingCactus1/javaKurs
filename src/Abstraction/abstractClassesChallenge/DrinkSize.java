package Abstraction.abstractClassesChallenge;

import java.util.Scanner;

public enum DrinkSize {
    LARGE, MEDIUM, SMALL;

    public String asString() {
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }

    public static void listAllDrinkSizes(){
        for (DrinkSize drinkSize : DrinkSize.values()) {
            System.out.println(drinkSize.asString());
        }
    }

    public static DrinkSize chooseDrinkSize(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose drink size");
        listAllDrinkSizes();
        String choice = input.nextLine();
        return switch (choice.toLowerCase()){
            case "large" -> DrinkSize.LARGE;
            case "medium" -> DrinkSize.MEDIUM;
            case "small" -> DrinkSize.SMALL;
            default -> chooseDrinkSize();
        };
    }
}
