package OOPMasterChallenge;

import java.util.Scanner;

public class Drink extends SellableStuff{
    boolean ice;
    String size;

    public Drink(boolean ice, String size, String name, double pricing){
        super(name, pricing);
        this.ice = ice;
        this.size = size;
    }
    public Drink(){
        super("Coke", 4.2);
        this.ice = true;
        this.size = "Medium";
    }

    public Drink(String name, double pricing){
        super(name, pricing);
        this.ice = true;
        this.size = "Medium";
    }

    public void listDrink(){
        System.out.println("=========================");
        System.out.println("Name: " + this.getName());
        System.out.println("Ice: " + (this.ice == true ? "yes" : "no"));
        System.out.println("Size: " + this.size);
        System.out.println("Price: " + this.getTotalPrice());
        System.out.println("=========================");
    }

    public void editDrink(){
        Scanner input = new Scanner(System.in);
        this.listDrink();
        System.out.println("What would you like to edit?");
        System.out.printf("%s%n".repeat(2),
                "1. Ice",
                "2. Size");
        String choice = input.nextLine();
        switch (choice.toLowerCase()){
            case "1", "ice" ->  this.changeIce();
            case "2", "size" -> this.changeSize();
        }
    }

    public double getTotalPrice(){
        return switch (this.size.toLowerCase()){
            case "large" -> this.getPricing() * 1.2;
            case "small"-> this.getPricing() * 0.8;
            default -> this.getPricing();
        };
    }

    private void changeSize(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a size");
        System.out.printf("%s%n".repeat(3),
                "1. Small",
                "2. Medium",
                "3. Large");
        String choice = input.nextLine();
        switch (choice.toLowerCase()){
            case "1", "small" -> this.size = "Small";
            case "3", "large" -> this.size = "Large";
            default -> this.size = "Medium";
        }
    }

    private void changeIce(){
        this.ice = !this.ice;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean isOnMenu(Menu menu) {
        return menu.getDrinks().stream().anyMatch(drink -> drink.getName().equalsIgnoreCase(this.getName()));
    }
}
