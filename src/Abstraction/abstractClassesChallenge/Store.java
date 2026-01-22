package Abstraction.abstractClassesChallenge;


import java.util.ArrayList;
import java.util.List;
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
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            do {
                this.assortment.add(ProductForSale.factory());
                System.out.printf("Add more items?%ny/n>");
                answer = scanner.nextLine();
            } while (!answer.equalsIgnoreCase("n"));
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
                    "4. Place an order",
                    "9. Cancel the order placement");
            System.out.print(">");
            String answer = scanner.nextLine();
            switch (answer.toLowerCase()) {
                case "1", "add", "add an item" -> this.incompleteOrder.add(OrderItem.orderItemFactory(this.assortment));
                case "2", "delete", "delete an item" -> this.deleteItem();
                case "3", "modify", "modify an item" -> this.modifyItem();
                case "4", "place", "place an order" -> {
                    listOrder(this.incompleteOrder);
                    this.completeOrders.add(new ArrayList<OrderItem>(this.incompleteOrder));
                    this.incompleteOrder.clear();
                    System.out.println("Order has been added!");
                    return;
                }
                default -> {
                    this.incompleteOrder.clear();
                    return;
                }
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
        listOrder(this.incompleteOrder);
        System.out.printf("Enter the name of item to delete%n>");
        String itemName = scanner.nextLine();
        if (findIndexOfItemInOrder(itemName) >= 0) {
            this.incompleteOrder.remove(findIndexOfItemInOrder(itemName));
        }
    }

    private void listOrder(ArrayList<OrderItem> orderItems){
        System.out.println("_".repeat(50));
        for (OrderItem orderItem : orderItems) {
            orderItem.printPricedItem();
        }
        System.out.println("_".repeat(50));
        System.out.println("Total" + " ".repeat(50 - ("Total" + getOrderTotal(orderItems)).length()) + getOrderTotal(orderItems));
        System.out.println("_".repeat(50));

    }

    private double getOrderTotal(ArrayList<OrderItem> orderItems){
        double sum = 0.0;
        for(OrderItem orderItem : orderItems){
            sum += orderItem.getSalesPrice();
        }
        return sum;
    }

    private void listCompleteOrders(){
        for (ArrayList<OrderItem> orderItems : completeOrders) {
            System.out.println("=".repeat(50));
            listOrder(orderItems);
            System.out.println("=".repeat(50));
        }
    }



    private void modifyItem(){
        Scanner scanner = new Scanner(System.in);
        listOrder(incompleteOrder);
        System.out.printf("Enter the name of item to modify%n>");
        String itemName = scanner.nextLine();
        if (findIndexOfItemInOrder(itemName) >= 0) {
            System.out.println("What would you like to modify?");
            System.out.printf("%s%n".repeat(3),
                    "1. Product",
                    "2. Quantity",
                    "9. Nothing");
            System.out.print(">");
            String answer = scanner.nextLine();
            switch (answer.toLowerCase()) {
                case "1", "product" -> this.incompleteOrder.get(findIndexOfItemInOrder(itemName)).setProductForSale(ProductForSale.factory(assortment));
                case "2", "quantity" -> this.incompleteOrder.get(findIndexOfItemInOrder(itemName)).setNewQuantity();
                default -> {}
            }
        }
    }

    public void mainAction(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("What would you like to do?");
            System.out.printf("%s%n".repeat(4),
                    "1. Show assortment",
                    "2. Show placed orders",
                    "3. Place an order",
                    "4. Close shift");
            System.out.print(">");
            String answer = scanner.nextLine();
            switch (answer.toLowerCase()) {
                case "1", "show assortment" ->  showAssortment();
                case "2", "show placed orders" -> listCompleteOrders();
                case "3", "place an order" -> createOrder();
                default -> {
                    listCompleteOrders();
                    return;
                }
            }
        }

    }
}

