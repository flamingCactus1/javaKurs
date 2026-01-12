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
            case "1", "add", "add item", "add an item" -> menu.addItem();
            case "2", "delete", "delete item", "delete an item" -> menu.deleteItem();
            case "3", "list", "list items", "list item", "list menu" -> menu.listMenu();
            default -> {
            }
        }
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

}