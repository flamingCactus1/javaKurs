package OOPMasterChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    private LinkedList<Burger> burgers;
    private LinkedList<Drink> drinks;
    private LinkedList<SellableStuff> sideDishes;
    private LinkedList<SellableStuff> extras;
    private Order standardOrder;

    public Menu(LinkedList<Burger> burgers, LinkedList<Drink> drinks, LinkedList<SellableStuff> sideDishes, LinkedList<SellableStuff> extras, Order standardOrder) {
        this.burgers = burgers;
        this.drinks = drinks;
        this.sideDishes = sideDishes;
        this.extras = extras;
        this.standardOrder = standardOrder;
    }

    public Menu() {
        this(new LinkedList<Burger>(), new LinkedList<Drink>(), new LinkedList<SellableStuff>(), new LinkedList<SellableStuff>(), new Order());
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

    public Order getStandardOrder() {
        return standardOrder;
    }

    public void setStandardOrder(Order standardOrder) {
        this.standardOrder = standardOrder;
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
        System.out.println("Standard Order");
        this.standardOrder.listOrder();
    }

    public void addBurger() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.printf("Name%n>");
        String name = input.next();
        System.out.printf("Choose a patty:%n1.Beef%n2.Chicken%n>");
        String pattyName = input.next();
        SellableStuff patty = new SellableStuff(pattyName, 0.0);
        LinkedList<SellableStuff> toppings = addToppingsToBurger();
        System.out.printf("price%n>");
        int price = input.nextInt();
        System.out.println("=========================");
        this.burgers.addLast(new Burger(name, price, true, patty, true, true, true, toppings.get(0), toppings.get(1), toppings.get(2)));
    }

    private static LinkedList<SellableStuff> addToppingsToBurger() {
        LinkedList<SellableStuff> toppings =  new LinkedList<SellableStuff>();
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("=========================");
            System.out.printf("Would you like to add an extra topping?%nY/N>");
            String response = input.next();
            if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
                System.out.printf("Provide a name for the topping%n>");
                String extraName = input.next();
                toppings.addLast(new SellableStuff(extraName, 0.0));
            } else {
                while (toppings.size() < 3) {
                    toppings.addLast(new SellableStuff("none", 0.0));
                }
                break;
            }
        } while (true);
        System.out.println("=========================");
        return toppings;
    }

    public void addItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.print("What would you like to add?%n1.Burger%n2.Side Dish %n3.Drink%4. Topping%n5. Exit>");
        String choice = input.next();
        System.out.println("=========================");
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
        System.out.println("=========================");
        System.out.printf("Name%n>");
        String name = input.next();
        System.out.printf("price%n>");
        double price = input.nextDouble();
        System.out.println("=========================");
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
        System.out.println("=========================");
        System.out.printf("What burger do you want to delete?%n>");
        this.listBurgers();
        System.out.print(">");
        String burgerName = input.next();
        System.out.println("=========================");
        try {
            this.burgers.removeIf(burger -> burger.getName().equalsIgnoreCase(burgerName));
        } catch (IllegalArgumentException e) {
            System.out.println(burgerName + " does not exist");
        }
    }

    private void removeSideDish() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.printf("What side dish do you want to delete?%n>");
        this.listSideDishes();
        System.out.print(">");
        String sideDishName = input.next();
        System.out.println("=========================");
        try {
            this.sideDishes.removeIf(sideDish -> sideDish.getName().equalsIgnoreCase(sideDishName));
        } catch (IllegalArgumentException e) {
            System.out.println(sideDishName + " does not exist");
        }
    }

    private void removeDrink() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.printf("What drink do you want to delete?%n>");
        this.listDrinks();
        System.out.print(">");
        String drinkName = input.next();
        System.out.println("=========================");
        try {
            this.drinks.removeIf(drink -> drink.getName().equalsIgnoreCase(drinkName));
        } catch (IllegalArgumentException e) {
            System.out.println(drinkName + " does not exist");
        }
    }

    private void removeTopping() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.printf("What topping do you want to delete?%n>");
        this.listExtras();
        System.out.print(">");
        String toppingName = input.next();
        System.out.println("=========================");
        try{
            this.extras.removeIf(topping -> topping.getName().equalsIgnoreCase(toppingName));
        }catch (IllegalArgumentException e){
            System.out.println(toppingName + " does not exist");
        }
    }

    private void setStandardOrder() {
        this.standardOrder.chooseBurger(this);
        this.standardOrder.chooseSideDish(this);
        this.standardOrder.chooseDrink(this);
    }

    public void editStandardOrder() {
        System.out.println("=========================");
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to change?");
        System.out.printf("%s%n".repeat(5),
                "1. Burger",
                "2. Drink",
                "3. Side dish",
                "4. The whole order",
                "5. Exit");
        System.out.print(">");
        String choice = input.nextLine();
        System.out.println("=========================");
        switch (choice.toLowerCase()) {
            case "1" , "burger" -> this.standardOrder.chooseBurger(this);
            case "2" , "drink" -> this.standardOrder.chooseDrink(this);
            case "3", "side dish", "side" ->  this.standardOrder.chooseSideDish(this);
            case "4", "order", "standard order", "the whole order", "the whole standard order" -> this.setStandardOrder();
            default -> {
            }
        }

    }
}
