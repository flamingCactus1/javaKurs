package OOPMasterChallenge;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Burger extends SellableStuff {
    private boolean buns;
    private SellableStuff patty;
    private boolean salad;
    private boolean onion;
    private boolean sauce;
    private LinkedList<SellableStuff> toppings;

    public Burger(String name, double price, boolean buns, SellableStuff patty, boolean salad, boolean onion, boolean sauce, LinkedList<SellableStuff> toppings) {
        super(name, price);
        this.buns = buns;
        this.patty = patty;
        this.salad = salad;
        this.onion = onion;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public Burger() {
        this("Default Burger", 5.0, true, new SellableStuff("beef", 0.0), true, true, true, new LinkedList<SellableStuff>());
    }

    public double getPrice() {
        return this.getPricing() + this.patty.getPricing() + this.calculateToppingPrice();
    }

    private double calculateToppingPrice(){
        double total = 0.00;
        int i = 0;
        while (i < this.toppings.size()){
            total += this.toppings.get(i).getPricing();
            i++;
        }
        return total;
    }

    public LinkedList<SellableStuff> getToppings() {
        return toppings;
    }

    public void setToppings(LinkedList<SellableStuff> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(SellableStuff topping){
        this.toppings.add(topping);
    }

    public void listBurger() {
        System.out.println("=========================");
        System.out.println("Name: " + this.getName());
        System.out.println("Patty: " + this.patty.getName());
        System.out.println("Buns: " + (this.buns == true ? "yes" : "no"));
        System.out.println("Salad: " + (this.salad == true ? "yes" : "no"));
        System.out.println("Onion: " + (this.onion == true ? "yes" : "no"));
        System.out.println("Sauce: " + (this.sauce == true ? "yes" : "no"));
        this.toppings.stream()
                .filter(toppings -> !toppings.getName().equalsIgnoreCase("none"))
                .forEach(toppings -> System.out.println("Topping: " + toppings.getName()));
        System.out.println("Price: " + this.getPrice());
        System.out.println("=========================");
    }

    public boolean isBuns() {
        return buns;
    }

    public SellableStuff getPatty() {
        return patty;
    }

    public boolean isSalad() {
        return salad;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setBuns(boolean buns) {
        this.buns = buns;
    }

    public void setPatty(SellableStuff patty) {
        this.patty = patty;
    }

    public void setSalad(boolean salad) {
        this.salad = salad;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

//    public void editToppings(Menu menu) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("=========================");
//        System.out.println("Extra1: " + this.extra1.getName());
//        System.out.println("Extra2: " + this.extra2.getName());
//        System.out.println("Extra3: " + this.extra3.getName());
//        System.out.println("What topping would you like to edit?");
//        System.out.print(">");
//        String choice = input.nextLine();
//        if (choice.equalsIgnoreCase(this.extra1.getName())) {
//            this.extra1.editTopping(menu);
//        } else if (choice.equalsIgnoreCase(this.extra2.getName())) {
//            this.extra2.editTopping(menu);
//        } else if (choice.equalsIgnoreCase(this.extra3.getName())) {
//            this.extra3.editTopping(menu);
//        } else {
//            System.out.println("Invalid choice");
//        }
//        System.out.println("=========================");
//    }

    public void editToppings(Menu menu, int amountOfToppings) {
        System.out.println("========================");
        SellableStuff extra = new SellableStuff();
        while (this.toppings.size() <  amountOfToppings) {
            extra.editTopping(menu);
            this.toppings.add(extra);
        }
    }


}