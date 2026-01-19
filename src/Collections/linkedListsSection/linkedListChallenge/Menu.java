package Collections.linkedListsSection.linkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Menu {
    private LinkedList<TownWithDistanceFromSidney> townList;

    public Menu(LinkedList<TownWithDistanceFromSidney> townList) {
        this.townList = townList;
    }

    public LinkedList<TownWithDistanceFromSidney> getTownList() {
        return townList;
    }

    public void setTownList(LinkedList<TownWithDistanceFromSidney> townList) {
        this.townList = townList;
    }

    public void mainAction() {
        Scanner input = new Scanner(System.in);
        String choice = "";
        ListIterator<TownWithDistanceFromSidney> iterator = townList.listIterator();
        while (!choice.equalsIgnoreCase("quit") || !choice.equalsIgnoreCase("q")) {
            System.out.println("=".repeat(20));
            System.out.println("Current element:");
            TownWithDistanceFromSidney current = null;
            if (iterator.hasNext()) {
                current = iterator.next();
                iterator.previous();
            } else {
                current = iterator.previous();
                iterator.next();
            }

            current.printTownStats();
            System.out.printf("%s%n".repeat(6),
                    "Available actions (select word or letter)",
                    "(F)orward",
                    "(B)ackward",
                    "(L)ist places",
                    "(M)enu",
                    "(Q)uit");
            System.out.print(">");
            choice = input.nextLine();
            switch (choice.toLowerCase()) {
                case "f", "forward" -> this.moveForward(iterator);
                case "b", "backward" -> this.moveBackward(iterator);
                case "l", "list", "list places" -> this.listTowns();
                case "m", "menu" ->this.secondMenu();
                default -> {

                }
            }
            System.out.println("=".repeat(20));
            if (choice.equalsIgnoreCase("q") || choice.equalsIgnoreCase("quit")) {
                break;
            }
        }
    }

    private void listTowns() {
        ListIterator<TownWithDistanceFromSidney> iterator = townList.listIterator();
        while (iterator.hasNext()) {
            TownWithDistanceFromSidney current = (TownWithDistanceFromSidney) iterator.next();
            current.printTownStats();
        }
    }

    private void moveForward(ListIterator<TownWithDistanceFromSidney> iterator) {
        if (iterator.hasNext()) {
            iterator.next();
        }
    }

    private void moveBackward(ListIterator<TownWithDistanceFromSidney> iterator) {
        if (iterator.hasPrevious()) {
            iterator.previous();
        }
    }

    private void removeElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a town name%n>");
        String name = scanner.nextLine();
        if (checkIfElementIsOnList(name)) {
            ListIterator<TownWithDistanceFromSidney> iterator = townList.listIterator();
            while (iterator.hasNext()) {
                TownWithDistanceFromSidney current = iterator.next();
                if (current.getTownName().equalsIgnoreCase(name)) {
                    iterator.remove();
                    break;
                }
            }
        } else {
            System.out.println("No such town");
        }
    }

    private void addElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a town name%n>");
        String name = scanner.nextLine();
        if (checkIfElementIsOnList(name)) {
            System.out.println("This town is already in the list");
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
                        TownWithDistanceFromSidney town = new TownWithDistanceFromSidney(name, distanceFromSidneyInKM);
                    }
                }
            }
        }
    }

    private boolean checkIfElementIsOnList(String townName) {
        ListIterator<TownWithDistanceFromSidney> iterator = townList.listIterator();
        while (iterator.hasNext()) {
            TownWithDistanceFromSidney current = iterator.next();
            if (current.getTownName().equalsIgnoreCase(townName)) {
                return true;
            }
        }
        return false;
    }

    private void secondMenu(){
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (true){
            System.out.printf("%s%n".repeat(3),
                    "(A)dd a town",
                    "(R)emove a town",
                    "(Q)uit");
            System.out.print(">");
            choice = scanner.nextLine();
            switch (choice.toLowerCase()) {
                case "a", "add a town" -> addElement();
                case "d", "remove a town" -> removeElement();
            }
            if (choice.equalsIgnoreCase("quit") || choice.equalsIgnoreCase("q")) {
                break;
            }
        }
    }
}

