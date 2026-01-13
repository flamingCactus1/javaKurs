package OOPMasterChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class MenuFactory {

    public Menu editMenu(Menu menu) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        listMainActionsMenu();
        choice = input.nextLine();
        switch (choice.toLowerCase()) {
            case "1", "add", "add item", "add an item" -> menu.addItem();
            case "2", "delete", "delete item", "delete an item" -> menu.deleteItem();
            case "3", "list", "list items", "list item", "list menu" -> menu.listMenu();
            case "4", "standard", "standard order", "edit standard order", "edit the standard order",
                 "edit the standard" -> menu.editStandardOrder();
            case "5", "standard menu", "create the standard menu", "create standard menu" ->
                    this.createDefaultMenu(menu);
            default -> {
            }
        }
        menu.getExtras().add(new SellableStuff("none", 0.00));
        return menu;
    }

    public Menu editMenu() {
        Menu menu = new Menu();
        return editMenu(menu);
    }

    private void listMainActionsMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("What would you like to do");
        System.out.printf("%s%n".repeat(6),
                "1. Add an item",
                "2. Delete an item",
                "3. List items",
                "4. Edit or set the standard order",
                "5. Create a standard menu",
                "6. Exit");
        System.out.print(">");

    }

    private void createDefaultMenu(Menu menu) {
        SellableStuff cheese = new SellableStuff("cheese", 0.00);
        SellableStuff bacon = new SellableStuff("bacon", 0.00);
        menu.getBurgers().add(new Burger("hamburger", 5.99, true, new SellableStuff("beef", 0.00), true, true, true, new LinkedList<SellableStuff>()));
        menu.getBurgers().add(new Burger("cheeseburger", 6.99, true, new SellableStuff("beef", 0.00), true, true, true, new LinkedList<SellableStuff>()));
        menu.getBurgers().stream()
                .filter(burger -> burger.getName().equalsIgnoreCase("cheeseburger"))
                .forEach(burger -> burger.addTopping(cheese));
        menu.getBurgers().add(new Burger("bacon burger", 6.99, true, new SellableStuff("beef", 0.00), true, true, true, new LinkedList<SellableStuff>()));
        menu.getBurgers().stream()
                .filter(burger -> burger.getName().equalsIgnoreCase("bacon burger"))
                .forEach(burger -> burger.addTopping(bacon));
        menu.getBurgers().stream()
                .filter(burger -> burger.getName().equalsIgnoreCase("bacon burger"))
                .forEach(burger -> burger.addTopping(cheese));
        menu.getSideDishes().add(new SellableStuff("fries", 3.99));
        menu.getSideDishes().add(new SellableStuff("potato wedges", 4.99));
        menu.getSideDishes().add(new SellableStuff("curly fries", 4.99));
        menu.getDrinks().add(new Drink(true, "medium", "coke", 3.29));
        menu.getDrinks().add(new Drink(true, "medium", "sprite", 2.29));
        menu.getDrinks().add(new Drink(true, "medium", "water", 1.59));
        menu.getExtras().add(new SellableStuff("cheese", 1.00));
        menu.getExtras().add(new SellableStuff("bacon", 1.50));
        menu.getExtras().add(new SellableStuff("egg", 0.50));
        System.out.println("Please enter the standard order");
        menu.setStandardOrder();
    }


}