package OOPMasterChallenge;

import java.util.Scanner;

public class SellableStuff {
    private String name;
    private double pricing;

    public SellableStuff(String name, double pricing) {
        this.name = name;
        this.pricing = pricing;
    }

    public SellableStuff(){
        this("none", 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricing() {
        return pricing;
    }

    public void setPricing(double pricing) {
        this.pricing = pricing;
    }

    public void editTopping(Menu menu) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        menu.listExtras();
        System.out.println("Chose a new topping");
        System.out.print(">");
        String choice = input.nextLine();
        SellableStuff searchResult = menu.getExtras().stream()
                .filter(extra -> extra.getName().equalsIgnoreCase(choice))
                .findFirst()
                .orElse(null);
        if (searchResult != null) {
            this.name = searchResult.getName();
            this.pricing = searchResult.getPricing();
        }else {
            this.name = "none";
            this.pricing = 0.0;
        }
    }

    public boolean isOnMenu(Menu menu) {
        return (this.isOnDrinks(menu) || this.isOnSideDishes(menu));
    }

    private boolean isOnDrinks(Menu menu){
        return menu.getDrinks().stream().anyMatch(drink -> drink.getName().equalsIgnoreCase(this.name));
    }

    private boolean isOnSideDishes(Menu menu){
        return menu.getSideDishes().stream().anyMatch(sideDish -> sideDish.getName().equalsIgnoreCase(this.name));
    }


    public void listSellableStuff() {
        System.out.println("=========================");
        System.out.println("Name: " + this.name);
        System.out.println("Pricing: " + this.pricing);
        System.out.println("=========================");
    }
}
