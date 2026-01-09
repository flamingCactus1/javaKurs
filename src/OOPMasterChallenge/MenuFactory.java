package OOPMasterChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class MenuFactory {

    public static void editMenu(Menu menu) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        listMainActionsMenu();
        choice = input.nextLine();
        switch (choice.toLowerCase()) {
            case "1", "add", "add item", "add an item" -> addItem(menu);
            case "2", "delete", "delete item", "delete an item" -> deleteItem(menu);
            case "3", "list", "list items", "list item", "list menu" -> listMenu(menu);
            default -> {
            }
        }
    }

    private static void listMenu(Menu menu) {
        
    }

    private static void listMainActionsMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("What would you like to do");
        System.out.printf("%s%n".repeat(3),
                "1. Add an item",
                "2. Delete an item",
                "3. List items");
        System.out.println("=========================");
    }


    private static void addBurger(Menu menu) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Name%n>");
        String name = input.next();
        System.out.printf("Choose a patty:%n1.Beef%n2.Chicken%n>");
        String pattyName = input.next();
        SellableStuff patty = new SellableStuff(pattyName, 0.0);
        LinkedList<SellableStuff> toppings = addToppingsToBurger(3);
        System.out.printf("price%n>");
        int price = input.nextInt();
        menu.getBurgers().addLast(new Burger(name, price, true, patty, true, true, true, toppings.get(0), toppings.get(1), toppings.get(2)));
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

    private static void addItem(Menu menu) {
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to add?%n1.Burger%n2.Side Dish %n3.Drink%4. Topping%n5. Exit>");
        String choice = input.next();
        switch (choice.toLowerCase()) {
            case "burger", "1" -> addBurger(menu);
            case "side", "side dish", "2" -> addSideDish(menu);
            case "drink", "3" -> addDrink(menu);
            case "topping", "4" -> addTopping(menu);
            default -> {
            }
        }
    }

    private static void addDrink(Menu menu) {
        SellableStuff nameAndPriceForDrink = getBasicSellableStuffSpecs();
        menu.getDrinks().addLast(new Drink(true, "Middle", nameAndPriceForDrink.getName(), nameAndPriceForDrink.getPricing()));
    }

    private static void addTopping(Menu menu) {
        menu.getExtras().addLast(getBasicSellableStuffSpecs());
    }

    private static void addSideDish(Menu menu) {
        menu.getSideDishes().addLast(getBasicSellableStuffSpecs());
    }

    private static SellableStuff getBasicSellableStuffSpecs(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Name%n>");
        String name = input.next();
        System.out.printf("price%n>");
        double price = input.nextDouble();
        return new SellableStuff(name, price);
    }

    private static void deleteItem(Menu menu) {
        System.out.printf("What item do you want to delete?%n>");
        Scanner input = new Scanner(System.in);
        String itemName = input.next();

    }

}