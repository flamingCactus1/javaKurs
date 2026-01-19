package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DIARY", 1);
    }

    public void printGroceryItem() {
        System.out.printf("%s%n".repeat(3),
                "Name: ".concat(name),
                "Type: ".concat(type),
                "Count: ".concat(String.valueOf(count)));
        System.out.println("=".repeat(20));
    }
}

public class Main {

    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));
        originalList.sort(Comparator.naturalOrder());
        System.out.println("sorted: " + Arrays.toString(originalArray));

        List<String> list = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(list);

        var listOne = List.of("Sunday", "Monday", "Tuesday");
        listOne.sort(Comparator.naturalOrder());
    }
}

