package Abstraction.abstractClassesChallenge;

import java.util.Scanner;

public class Drink extends ProductForSale {
    private boolean isSoda;
    private DrinkSize drinkSize;

    public Drink(String name, double price, String description, boolean isSoda, DrinkSize drinkSize) {
        super(name, price, description);
        this.isSoda = isSoda;
        this.drinkSize = drinkSize;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Description: " + this.getDescription());
        System.out.println("Soda: " + (this.isSoda ? "yes" : "no"));
        System.out.println("DrinkSize: " + this.drinkSize.asString());
    }

    public static Drink factory(){
        Drink drink = new Drink("", 0.00, "", false, DrinkSize.SMALL);
        drink.collectName();
        drink.collectPrice();
        drink.collectDescription();
        drink.collectIsSoda();
        drink.collectDrinkSize();
        return drink;
    }

    private void collectIsSoda(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Is this drink soda%ny/n>");
        String choice = input.nextLine();
        this.isSoda = choice.equalsIgnoreCase("y");
    }

    private void collectDrinkSize(){
        this.drinkSize = DrinkSize.chooseDrinkSize();
    }
}
