package Abstraction.abstractClassesChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class ProductForSale {
    private String name;
    private double price;
    private String description;

    public ProductForSale(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void showDetails();

    public static ProductForSale factory(ArrayList<ProductForSale> assortment) {
        Scanner input = new Scanner(System.in);
        ProductForSale productForSale = null;
        while (productForSale == null) {
            System.out.println("Please choose product");
            for (ProductForSale product: assortment) {
                System.out.println("=".repeat(50));
                product.showDetails();
                System.out.println("=".repeat(50));
            }
            System.out.print("Enter the product name: ");
            String productName = input.nextLine();
            productForSale = assortment.stream()
                    .filter(product -> product.getName().equalsIgnoreCase(productName))
                    .findFirst()
                    .orElse(null);
            if (productForSale == null) {
                System.out.println("Product not found");
            }
        }
        return productForSale;
    }

    public void collectName() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the product name%n> ");
        this.name = input.nextLine();
    }

    public void collectPrice() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the product price%n> ");
        double productPrice = Double.parseDouble(input.nextLine());
        this.price = (double) Math.max(0, productPrice);
    }

    public void collectDescription() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the product description%n> ");
        this.description = input.nextLine();
    }

    public static ProductForSale factory() {
        Scanner input = new Scanner(System.in);
        ProductForSale productForSale = null;
        System.out.println("What would you like to add?");
        System.out.printf("%s%n".repeat(3),
                "1. Drink",
                "2. Pastry",
                "3. Coffee Beans");
        String choice = input.nextLine();
        return switch (choice.toLowerCase()) {
            case "1", "drink" -> Drink.factory();
            case "2", "pastry" -> Pastry.factory();
            case "3", "coffee", "beans", "coffee beans" -> CoffeeBeans.factory();
            default -> null;
        };
    }


}