package Abstraction.abstractClassesChallenge;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import java.util.Scanner;

public enum TypesOfBrewing {
    ESPRESSO, MOKA_POT, FILTER, COLD_BREW;

    public static void listAllTypesOfBrewing(){
        for (TypesOfBrewing type : TypesOfBrewing.values()){
            System.out.println(type.asSting());
        }
    }

    public String asSting(){
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }

    public static TypesOfBrewing chooseType(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose type of brewing");
        listAllTypesOfBrewing();
        String choice = input.nextLine();
        return switch (choice.toLowerCase()){
            case "espresso" -> ESPRESSO;
            case "moka", "moka pot" -> MOKA_POT;
            case "filter" -> FILTER;
            case "cold brew" -> COLD_BREW;
            default -> chooseType();
        };
    }
}
