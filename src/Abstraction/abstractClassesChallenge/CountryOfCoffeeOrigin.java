package Abstraction.abstractClassesChallenge;

import java.util.Scanner;

public enum CountryOfCoffeeOrigin {
    BRAZIL, RWANDA, MEXICO, SOUTH_AFRICA, ETHIOPIA;

    public static CountryOfCoffeeOrigin chooseCountryOfCoffeeOrigin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Country Of Coffee Origin");
        CountryOfCoffeeOrigin.listAllCountries();
        String choice = input.nextLine();
        return switch(choice.toLowerCase()){
            case "brazil" -> CountryOfCoffeeOrigin.BRAZIL;
            case "rwanda" -> CountryOfCoffeeOrigin.RWANDA;
            case "mexico" -> CountryOfCoffeeOrigin.MEXICO;
            case "south africa" -> CountryOfCoffeeOrigin.SOUTH_AFRICA;
            case "ethiopia" -> CountryOfCoffeeOrigin.ETHIOPIA;
            default -> chooseCountryOfCoffeeOrigin();
        };
    }

    private static void listAllCountries() {
        for (CountryOfCoffeeOrigin countryOfCoffeeOrigin : CountryOfCoffeeOrigin.values()) {
            System.out.println(countryOfCoffeeOrigin.asString());
        }
    }

    public String asString(){
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }
}
