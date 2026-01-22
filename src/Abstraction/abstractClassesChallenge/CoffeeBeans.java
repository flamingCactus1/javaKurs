package Abstraction.abstractClassesChallenge;

import java.util.Scanner;

public class CoffeeBeans extends ProductForSale{
    private boolean ground;
    private TypesOfBrewing typeOfBrewing;
    private CountryOfCoffeeOrigin countryOfOrigin;

    public CoffeeBeans(String name, double price, String description, boolean ground, TypesOfBrewing typeOfBrewing, CountryOfCoffeeOrigin countryOfOrigin) {
        super(name, price, description);
        this.ground = ground;
        this.typeOfBrewing = typeOfBrewing;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Description: " + this.getDescription());
        System.out.println("Ground: " + (this.ground ? "yes" : "no"));
        System.out.println("Type of Brewing: " + this.typeOfBrewing.asSting());
        System.out.println("Country of Origin: " + this.countryOfOrigin.asString());
    }

    public static CoffeeBeans factory(){
        CoffeeBeans coffeeBeans = new CoffeeBeans("", 0.00, "", false, TypesOfBrewing.ESPRESSO, CountryOfCoffeeOrigin.BRAZIL);
        coffeeBeans.collectName();
        coffeeBeans.collectPrice();
        coffeeBeans.collectDescription();
        coffeeBeans.collectGround();
        coffeeBeans.collectTypeOfBrewing();
        coffeeBeans.collectCountryOfCoffeeOrigin();
        return coffeeBeans;
    }

    private void collectGround(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Are these beans ground?%ny/n>");
        String choice = input.nextLine();
        this.ground = choice.equalsIgnoreCase("y");
    }

    private void collectTypeOfBrewing(){
        this.typeOfBrewing = TypesOfBrewing.chooseType();
    }

    private void collectCountryOfCoffeeOrigin(){
        this.countryOfOrigin = CountryOfCoffeeOrigin.chooseCountryOfCoffeeOrigin();
    }


}

