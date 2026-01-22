package Abstraction.abstractClassesChallenge;

import java.util.Scanner;

public class Pastry extends ProductForSale{
    private PastryType type;
    private String filling;

    public Pastry(String name, double price, String description, PastryType type, String filling) {
        super(name, price, description);
        this.type = type;
        this.filling = filling;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Description: " + this.getDescription());
        System.out.println("Type: " + this.type.asString());
        System.out.println("Filling: " + this.filling);
    }

    private void collectPastryType(){
        this.type = PastryType.choosePastryType();
    }

    private void collectPastryFilling(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the filling%n>");
        this.filling = input.nextLine();
    }

    public static Pastry factory(){
        Pastry pastry = new Pastry("", 0.00, "", PastryType.SAVORY, "");
        pastry.collectName();
        pastry.collectPrice();
        pastry.collectDescription();
        pastry.collectPastryType();
        pastry.collectPastryFilling();
        return pastry;
    }


}
