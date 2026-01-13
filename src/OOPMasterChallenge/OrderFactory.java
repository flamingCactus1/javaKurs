package OOPMasterChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class OrderFactory {
    private Menu menu;

    public void startShift(Menu menu) {
        if (menu == null) {
            System.out.println("Menu is null");
            return;
        }
        LinkedList<Order> orders = new LinkedList<>();
        while (true) {
            Scanner input = new Scanner(System.in);
            listActions();
            String choice = input.nextLine();
            switch (choice.toLowerCase()) {
                case "1", "place order", "place an order" -> {
                    orders.add(Order.placeOrder(menu));
                }
                case "2", "place standard", "place standard order", "standard order", "standard" -> {
                    orders.add(placeStandardOrder(menu));
                }
                case "3", "edit", "edit standard", "edit standard order", "edit the standard order" -> {
                    menu.editStandardOrder();
                }
                default -> {
                }
            }
            if (choice.equalsIgnoreCase("exit") || choice.equalsIgnoreCase("4")) {
                System.out.println("The shift is ended");
                System.out.println("Orders from today:");
                System.out.println("+++++++++++++++++++++++++");
                orders.forEach(Order::listOrder);
                System.out.println("+++++++++++++++++++++++++");
                break;
            }
        }
    }

    private static Order placeStandardOrder(Menu menu) {
        return menu.getStandardOrder();
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
