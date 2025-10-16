package ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Customer john = new Customer("John", 1900, "john@web.de");
        Customer tom = new Customer("Tom", "tom@web.de");
        Customer anonCustomer = new Customer();
    }
}
