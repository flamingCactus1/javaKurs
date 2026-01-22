package Abstraction.abstractClassesChallenge;


import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<ProductForSale> assortment;
    private ArrayList<ArrayList<OrderItem>> completeOrders;
    private ArrayList<OrderItem> incompleteOrder;

    public Store(ArrayList<ProductForSale> assortment) {
        this.assortment = assortment;
        this.completeOrders = new ArrayList<ArrayList<OrderItem>>();
        this.incompleteOrder = new ArrayList<OrderItem>();
    }

    public void createAssortment() {
        System.out.printf("Would you like to crate an assortment manually%ny/n>");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("y")) {
            while(true){
                this.assortment.add(ProductForSale.factory());
            }
        }else {
            this.assortment = createDefaultAssortment();
        }
    }

    private ArrayList<ProductForSale> createDefaultAssortment() {
        ArrayList<ProductForSale> assortment = new ArrayList<>();
        assortment.add(new CoffeeBeans("Arabica 100%", 9.99, "Sour and creamy", false, TypesOfBrewing.ESPRESSO, CountryOfCoffeeOrigin.BRAZIL));
        assortment.add(new CoffeeBeans("Arabica 70 / Robusta 30", 8.99, "Sour with bitter notes", false, TypesOfBrewing.MOKA_POT, CountryOfCoffeeOrigin.RWANDA));
        assortment.add(new CoffeeBeans("Arabica 30 / Robusta 70", 6.99, "Bitter and a bit more bitter", true, TypesOfBrewing.FILTER, CountryOfCoffeeOrigin.MEXICO));
        assortment.add(new Pastry("Sausage Roll", 1.99, "Sausage in dough", PastryType.SAVORY, "Sausage"));
        assortment.add(new Pastry("Danish", 1.50, "Rally sweet and cherry-sh", PastryType.SWEET, "Cherry"));
        assortment.add(new Drink("Coke", 2.30, "Just coke", true, DrinkSize.MEDIUM));
        assortment.add(new Drink("Peach iced tea", 3.50, "Cold and tastes like peaches", false, DrinkSize.SMALL));
        assortment.add(new Drink("Water", 0.50, "Just water", false, DrinkSize.SMALL));
        return assortment;
    }

    public void showAssortment(){
        System.out.println("Assortment:");
        for (ProductForSale product:  assortment){
            System.out.println("=".repeat(50));
            product.showDetails();
            System.out.println("=".repeat(50));
        }
    }

    public void createOrder(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("What would you like to do?");
            System.out.printf("%s%n".repeat(5),
                    "1. Add an item",
                    "2. Delete an item",
                    "3. Modify an item",
                    "4. Cancel the order placement",
                    "9. Place an order");
            System.out.print(">");
            String answer = scanner.nextLine();
            switch (answer.toLowerCase()) {
                case "1", "add", "add an item" -> this.incompleteOrder.add(OrderItem.orderItemFactory(this.assortment));
                case "2", "delete", "delete an item" -> this.deleteItem();
                case "3", "modify", "modify an item" -> this.
            }
        }
    }

    //returns either an index of item or -1 if not found
    private int findIndexOfItemInOrder(String itemName){
        OrderItem index = this.incompleteOrder.stream()
                .filter(orderItem -> orderItem.getProductForSale().getName().equalsIgnoreCase(itemName))
                .findFirst()
                .orElse(null);
        return this.incompleteOrder.indexOf(index);
    }

    private void deleteItem(){
        Scanner scanner = new Scanner(System.in);
        listOrder();
        System.out.printf("Enter the name of item to delete%n>");
        String itemName = scanner.nextLine();
        if (findIndexOfItemInOrder(itemName) >= 0) {
            this.incompleteOrder.remove(findIndexOfItemInOrder(itemName));
        }
    }

    private void listOrder(){
        System.out.println("_".repeat(50));
        for (OrderItem orderItem : this.incompleteOrder) {
            orderItem.printPricedItem();
        }
        System.out.println("_".repeat(50));
    }

    private void modifyItem(){
        Scanner scanner = new Scanner(System.in);
        listOrder();
        System.out.printf("Enter the name of item to modify%n>");
        String itemName = scanner.nextLine();
        if (findIndexOfItemInOrder(itemName) >= 0) {
            System.out.println("What would you like to modify?");
            System.out.printf("");
        }
    }
}

