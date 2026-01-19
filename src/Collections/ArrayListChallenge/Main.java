package Collections.ArrayListChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        while(true){
            int choice = receiveActionCommand();
            switch (choice){
                case 1 -> addItem(groceries);
                case 2 -> deleteItem(groceries);
                default -> {
                }
            }
            if (choice == 0){break;}
        }
    }

    private static int receiveActionCommand(){
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Available actions:");
        System.out.printf("%s%n".repeat(3),
                "0 - to shutdown",
                "1 - to add item(s) to list (coma delimited list)",
                "2 - to remove any items (coma delimited list)");
        System.out.print("Enter the action number: ");
        choice = input.nextInt();
        return choice;
    }

    private static void deleteItem(ArrayList<String> list){
        ArrayList<String> itemsToDelete = receiveString();
        list.removeAll(itemsToDelete);
        list.sort(Comparator.naturalOrder());
        printGroceryList(list);
    }

    private static void addItem(ArrayList<String> list){
        ArrayList<String> itemsToAdd = receiveString();
        itemsToAdd.removeIf(list::contains);
        list.addAll(itemsToAdd);
        list.sort(Comparator.naturalOrder());
        printGroceryList(list);
    }

    private static ArrayList<String> receiveString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the list delimited by coma: ");
        String input =  scanner.nextLine();
        String[] receivedInput = input.split(",");
        ArrayList<String> result = new ArrayList<>();
        for (String item : receivedInput) {
            String trimmedItem = item.trim();
            result.add(trimmedItem);
        }
        return removeDuplicates(result);
    }

    private static ArrayList<String> removeDuplicates(ArrayList<String> list){

        return list.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static void printGroceryList(ArrayList<String> list){
        list.forEach(element -> System.out.println(list.indexOf(element) + ": " + element));
    }
}
