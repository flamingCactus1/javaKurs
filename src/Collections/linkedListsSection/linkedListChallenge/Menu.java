package Collections.linkedListsSection.linkedListChallenge;

import java.util.LinkedList;
import java.util.List;
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
}

