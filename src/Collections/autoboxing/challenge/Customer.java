package Collections.autoboxing.challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public static Customer createCustomer(String name) {
        return new Customer(name, new ArrayList<Double>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return  "Customer{" + "name=" + name + ", transactions=" + transactions + '}';
    }

    public double getCurrentBalance() {
        double balance = 0;
        for (Double transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }
}
