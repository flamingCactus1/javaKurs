package Collections;

import java.util.ArrayList;
import java.util.Arrays;

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
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("potato", "vegetables", 6);
        groceryArray[2] = new GroceryItem("Oranges", "fruits", 4);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryArrayList = new ArrayList<>();
        groceryArrayList.add(new GroceryItem("butter"));
        groceryArrayList.add(new GroceryItem("bread", "bread", 2);
        groceryArrayList.add(new GroceryItem("onion", "vegetables", 1));
        groceryArrayList.forEach(GroceryItem::printGroceryItem);
    }
}
