package OOPMasterChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class OrderFactory {
    private Menu menu;

    public static void createOrder(Menu menu, LinkedList<Order> orders) {
        Scanner input = new Scanner(System.in);
        listActions();
        String choice = input.nextLine();
        switch (choice.toLowerCase()) {
            case "1", "place order", "place an order" -> {
                orders.addLast(placeOrder(menu));
            }
            case "2", "place standard", "place standard order", "standard order", "standard" -> {
                orders.addLast(placeStandardOrder(menu));
            }
            case "3", "edit", "edit standard", "edit standard order", "edit the standard order" -> {
                menu.editStandardOrder();
                createOrder(menu, orders);
            }
            default -> {
            }
        }
    }

    private static Order placeStandardOrder(Menu menu) {
        return menu.getStandardOrder();
    }

    private static Order placeOrder(Menu menu){
        Order order = new Order();
        Scanner input = new Scanner(System.in);

        return order;
    }

    private static void listActions() {
        System.out.println("What would you like to do?");
        System.out.printf("%s%n".repeat(4),
                "1. place an order",
                "2. place a standard order",
                "3. Set or edit the standard order",
                "4. Exit");
        System.out.print(">");
    }

}
