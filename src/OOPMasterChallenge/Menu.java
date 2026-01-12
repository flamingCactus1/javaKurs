package OOPMasterChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    private LinkedList<Burger> burgers;
    private LinkedList<Drink> drinks;
    private LinkedList<SellableStuff> sideDishes;
    private LinkedList<SellableStuff> extras;

    public Menu(LinkedList<Burger> burgers, LinkedList<Drink> drinks, LinkedList<SellableStuff> sideDishes, LinkedList<SellableStuff> extras) {
        this.burgers = burgers;
        this.drinks = drinks;
        this.sideDishes = sideDishes;
        this.extras = extras;
    }

    public LinkedList<Burger> getBurgers() {
        return burgers;
    }

    public void setBurgers(LinkedList<Burger> burgers) {
        this.burgers = burgers;
    }

    public LinkedList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(LinkedList<Drink> drinks) {
        this.drinks = drinks;
    }

    public LinkedList<SellableStuff> getSideDishes() {
        return sideDishes;
    }

    public void setSideDishes(LinkedList<SellableStuff> sideDishes) {
        this.sideDishes = sideDishes;
    }

    public LinkedList<SellableStuff> getExtras() {
        return extras;
    }

    public void setExtras(LinkedList<SellableStuff> extras) {
        this.extras = extras;
    }

    public void listBurgers() {
        this.burgers.forEach(Burger::listBurger);
    }

    public void listDrinks() {
        this.drinks.forEach(Drink::listDrink);
    }

    public void listExtras() {
        this.extras.forEach(SellableStuff::listSellableStuff);
    }

    public void listSideDishes() {
        this.sideDishes.forEach(SellableStuff::listSellableStuff);
    }

    public void listMenu(){
        System.out.println("Burgers");
        this.listBurgers();
        System.out.println("Side Dishes");
        this.listSideDishes();
        System.out.println("Drinks");
        this.listDrinks();
        System.out.println("Extras");
        this.listExtras();
    }

    public void addBurger() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Name%n>");
        String name = input.next();
        System.out.printf("Choose a patty:%n1.Beef%n2.Chicken%n>");
        String pattyName = input.next();
        SellableStuff patty = new SellableStuff(pattyName, 0.0);
        LinkedList<SellableStuff> toppings = addToppingsToBurger(3);
        System.out.printf("price%n>");
        int price = input.nextInt();
        this.burgers.addLast(new Burger(name, price, true, patty, true, true, true, toppings.get(0), toppings.get(1), toppings.get(2)));
    }

    private static LinkedList<SellableStuff> addToppingsToBurger(int toppingsAmount) {
        if (toppingsAmount < 0) {
            throw new IllegalArgumentException("toppings amount must be positive");
        }
        LinkedList<SellableStuff> toppings;
        do {
            toppings = new LinkedList<SellableStuff>();
            Scanner input = new Scanner(System.in);
            System.out.printf("Would you like to add an extra topping?%nY/N>");
            String response = input.next();
            if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
                System.out.printf("Provide a name for the topping%n>");
                String extraName = input.next();
                toppings.addLast(new SellableStuff(extraName, 0.0));
            } else {
                while (toppings.size() < toppingsAmount) {
                    toppings.addLast(new SellableStuff("none", 0.0));
                }
                break;
            }
        } while (true);
        return toppings;
    }

    public void addItem() {
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to add?%n1.Burger%n2.Side Dish %n3.Drink%4. Topping%n5. Exit>");
        String choice = input.next();
        switch (choice.toLowerCase()) {
            case "burger", "1" -> this.addBurger();
            case "side", "side dish", "2" -> this.addSideDish();
            case "drink", "3" -> this.addDrink();
            case "topping", "4" -> this.addTopping();
            default -> {
            }
        }
    }

    public void addDrink() {
        SellableStuff nameAndPriceForDrink = getBasicSellableStuffSpecs();
        this.drinks.addLast(new Drink(true, "Middle", nameAndPriceForDrink.getName(), nameAndPriceForDrink.getPricing()));
    }

    public void addTopping() {
        this.extras.addLast(getBasicSellableStuffSpecs());
    }

    public void addSideDish() {
        this.sideDishes.addLast(getBasicSellableStuffSpecs());
    }

    private static SellableStuff getBasicSellableStuffSpecs() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Name%n>");
        String name = input.next();
        System.out.printf("price%n>");
        double price = input.nextDouble();
        return new SellableStuff(name, price);
    }

    public void deleteItem() {
        Scanner input = new Scanner(System.in);
        System.out.printf("What item do you want to delete?%n>");
        System.out.printf("%s%n".repeat(5),
                "1. Burger",
                "2. Side Dish",
                "3. Drink",
                "4. Topping",
                "5. Exit");
        System.out.print(">");
        String itemName = input.next();
        switch (itemName.toLowerCase()) {
            case "burger", "1" -> this.removeBurger();
            case "side", "side dish", "2" -> this.removeSideDish();
            case "drink", "3" ->this.removeDrink();
            case "topping", "4" -> this.removeTopping();
            default -> {
            }
        }

    }
    // Refactor these methods later
    private void removeBurger() {
        Scanner input = new Scanner(System.in);
        System.out.printf("What burger do you want to delete?%n>");
        this.listBurgers();
        System.out.print(">");
        String burgerName = input.next();
        try {
            this.burgers.removeIf(burger -> burger.getName().equalsIgnoreCase(burgerName));
        } catch (IllegalArgumentException e) {
            System.out.println(burgerName + " does not exist");
        }
    }

    private void removeSideDish() {
        Scanner input = new Scanner(System.in);
        System.out.printf("What side dish do you want to delete?%n>");
        this.listSideDishes();
        System.out.print(">");
        String sideDishName = input.next();
        try {
            this.sideDishes.removeIf(sideDish -> sideDish.getName().equalsIgnoreCase(sideDishName));
        } catch (IllegalArgumentException e) {
            System.out.println(sideDishName + " does not exist");
        }
    }

    private void removeDrink() {
        Scanner input = new Scanner(System.in);
        System.out.printf("What drink do you want to delete?%n>");
        this.listDrinks();
        System.out.print(">");
        String drinkName = input.next();
        try {
            this.drinks.removeIf(drink -> drink.getName().equalsIgnoreCase(drinkName));
        } catch (IllegalArgumentException e) {
            System.out.println(drinkName + " does not exist");
        }
    }

    private void removeTopping() {
        Scanner input = new Scanner(System.in);
        System.out.printf("What topping do you want to delete?%n>");
        this.listExtras();
        System.out.print(">");
        String toppingName = input.next();
        try{
            this.extras.removeIf(topping -> topping.getName().equalsIgnoreCase(toppingName));
        }catch (IllegalArgumentException e){
            System.out.println(toppingName + " does not exist");
        }
    }
}
