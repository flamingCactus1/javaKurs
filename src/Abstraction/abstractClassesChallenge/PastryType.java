package Abstraction.abstractClassesChallenge;

import java.util.Scanner;

public enum PastryType {
    SAVORY, SWEET;

    public String asString() {
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }

    public static void listAllPastryTypes() {
        for (PastryType pastryType : PastryType.values()) {
            System.out.println(pastryType.asString());
        }
    }

    public static PastryType choosePastryType() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Pastry Type");
        listAllPastryTypes();
        String choice = input.nextLine();
        return switch (choice.toLowerCase()){
            case "savory" -> SAVORY;
            case "sweet" -> SWEET;
            default -> choosePastryType();
        };
    }
}
