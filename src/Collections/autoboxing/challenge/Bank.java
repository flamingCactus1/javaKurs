package Collections.autoboxing.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public static Bank createBank(String name) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(Customer.createCustomer("Ringo Star"));
        return new Bank(name, customers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCustomer(Customer... customersToAdd) {
        for (Customer customer : customersToAdd) {
            if (getCustomerIndex(customer.getName()) == -1) {
                this.customers.add(customer);
            }
        }
    }

    public void addCustomer() {
        ArrayList<Customer> customersToAdd = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("quit")) {
            System.out.printf("Enter Customer Name or quit to complete the addition%n>");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("quit")) {
                customersToAdd.add(Customer.createCustomer(input));
            }
        }
        addCustomer(customersToAdd);
    }

    public void addCustomer(ArrayList<Customer> customersToAdd) {
        for (Customer customer : customersToAdd) {
            if (getCustomerIndex(customer.getName()) == -1) {
                this.customers.add(customer);
            }
        }
    }

    public void addTransaction(String name, double amount) {
        try {
            this.customers.get(getCustomerIndex(name)).getTransactions().addLast(amount);
        } catch (Exception e) {
            System.out.println(name + " customer is not found");
        }
    }

    public void addTransaction() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.printf("Provide Customer Name%n>");
        input = scanner.nextLine();
        if (getCustomerIndex(input) != -1) {
            System.out.printf("Provide due amount%n>");
            double amount = Double.parseDouble(scanner.nextLine());
            addTransaction(input, amount);
        } else {
            System.out.println("Customer does not exist");
        }


    }

    //returns either an index of searched element or -1 if the element does not exist
    private int getCustomerIndex(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customers.indexOf(customer);
            }
        }
        return -1;
    }

    public void printStatement(String name) {
        try {
            System.out.println("Name: " + this.customers.get(getCustomerIndex(name)).getName());
            for (Double amount : this.customers.get(getCustomerIndex(name)).getTransactions()) {
                System.out.println("Transaction: " + amount);
            }
            System.out.println("Current Balance: " + this.customers.get(getCustomerIndex(name)).getCurrentBalance());
        } catch (Exception e) {
            System.out.println(name + " does not exist");
        }
    }

    public void printStatement() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Customer Name%n>");
        String name = scanner.nextLine();
        printStatement(name);
    }

    public void listCustomers() {
        int customerNumber = 1;
        for (Customer customer : customers) {
            System.out.println(customerNumber + ". " + customer.getName());
            customerNumber++;
        }
    }

}
