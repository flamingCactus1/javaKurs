package OOPMasterChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderFactory  orderFactory = new OrderFactory();
        MenuFactory menuFactory = new MenuFactory();
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while(true){
            System.out.println("=========================");
            System.out.println("Menu");
            System.out.printf("%s%n".repeat(3),
                    "1. Crete/edit the menu",
                    "2. Start the shift",
                    "3. Exit the application");
            System.out.print(">");
            String choice = input.nextLine();
            switch (choice.toLowerCase()){
                case "1", "crete/edit the menu", "create", "edit" -> menuFactory.editMenu(menu);
                case "2", "shift", "start shift", "start the shift" -> orderFactory.startShift(menu);
                case "3", "exit the application" -> System.exit(0);
            }
        }
    }
}
