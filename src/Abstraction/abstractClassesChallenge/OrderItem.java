package Abstraction.abstractClassesChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderItem {
    private ProductForSale productForSale;
    private int quantity;

    public OrderItem(ProductForSale productForSale, int quantity) {
        this.productForSale = productForSale;
        this.quantity = quantity;
    }

    public ProductForSale getProductForSale() {
        return productForSale;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductForSale(ProductForSale productForSale) {
        this.productForSale = productForSale;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalesPrice() {
        return this.productForSale.getPrice() * this.quantity;
    }

    public int calculateWhiteSpaces() {
        String stringToPrint = this.quantity + " " + this.productForSale.getName() + this.getSalesPrice();
        return Math.max((50 - stringToPrint.length()), 0);
    }

    public void printPricedItem() {
        System.out.println(this.quantity +
                " " +
                this.productForSale.getName() +
                " ".repeat(calculateWhiteSpaces()) +
                this.getSalesPrice());
    }

    public static OrderItem orderItemFactory(ArrayList<ProductForSale> assortment) {
        ProductForSale product = ProductForSale.factory(assortment);
        int quantity = -1;
        while (quantity < 0){
            System.out.printf("Please enter the quantity of the product%n>");
            Scanner scanner = new Scanner(System.in);
            quantity = Integer.parseInt(scanner.nextLine());
            if (quantity < 0){
                System.out.println("The quantity must be positive");
            }
        }
        return new OrderItem(product, quantity);
    }

    public void setNewQuantity(){
        int newQuantity = -1;
        while (newQuantity < 0){
            System.out.printf("Please enter the quantity of the product%n>");
            Scanner scanner = new Scanner(System.in);
            newQuantity = Integer.parseInt(scanner.nextLine());
            if (newQuantity < 0){
                System.out.println("The quantity must be positive");
            }
        }
        this.quantity = newQuantity;
    }


}
