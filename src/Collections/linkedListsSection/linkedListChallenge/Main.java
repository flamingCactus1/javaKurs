package Collections.linkedListsSection.linkedListChallenge;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<TownWithDistanceFromSidney> list = townListFactory();
        printTownList(list);

        Menu menu = new Menu(list);

        menu.mainAction();



    }

    private static LinkedList<TownWithDistanceFromSidney> townListFactory() {
        LinkedList<TownWithDistanceFromSidney> townList = new LinkedList<>();
        townList.add(new TownWithDistanceFromSidney()); // Why this empty town?
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Enter the town name or autofill to automatically fill out the list or exit to end filling up the list%n>");
            String input = scanner.nextLine().trim(); // trim() helps too
            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("autofill") || input.equalsIgnoreCase("auto")) {
                autofill(townList);
                break;
            } else {
                int distanceFromSidneyInKM;
                while (true) {
                    System.out.printf("Enter the distance from sidney in KM%n>");
                    if (scanner.hasNextInt()) { // Safe check
                        distanceFromSidneyInKM = scanner.nextInt();
                        scanner.nextLine(); // CRITICAL: consume leftover newline
                        if (distanceFromSidneyInKM < 0) {
                            System.out.println("Please enter a positive value");
                        } else {
                            TownWithDistanceFromSidney town = new TownWithDistanceFromSidney(input, distanceFromSidneyInKM);
                            if (townIsNotAlreadyAdded(townList, town)) {
                                townList.add(town);
                            }else {
                                System.out.println("Town is already added");
                            }
                            break;
                        }
                    } else {
                        System.out.println("Not a valid input");
                        scanner.nextLine(); // consume invalid input
                    }
                }
            }
        }
        return townList;
    }

    private static void autofill(LinkedList<TownWithDistanceFromSidney> townList) {
        townList.add(new TownWithDistanceFromSidney("Adelaide", 1374));
        townList.add(new TownWithDistanceFromSidney("Alice Springs", 2771));
        townList.add(new TownWithDistanceFromSidney("Brisbane", 917));
        townList.add(new TownWithDistanceFromSidney("Darwin", 3972));
        townList.add(new TownWithDistanceFromSidney("Melbourne", 877));
        townList.add(new TownWithDistanceFromSidney("Perth", 3923));
    }

    private static void printTownList(LinkedList<TownWithDistanceFromSidney> list){
        ListIterator<TownWithDistanceFromSidney> iterator = list.listIterator();

        while (iterator.hasNext()){
            iterator.next().printTownStats();
        }
    }
    private static boolean townIsNotAlreadyAdded(LinkedList<TownWithDistanceFromSidney> list, TownWithDistanceFromSidney townToAdd){
        return list.stream().noneMatch(town ->town.getTownName().equalsIgnoreCase(townToAdd.getTownName()));
    }
}
