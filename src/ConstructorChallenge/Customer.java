package ConstructorChallenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Called a constructor with args");
    }

    public Customer() {
        this("undefined", 0, "undefined");
        System.out.println("Called a no-arg constructor");
    }

    public Customer(String name, String email) {
        this(name, 0.0, email);
        System.out.println("Called a constructor with args name and email");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
