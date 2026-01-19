package Collections.autoboxing.challenge;

import java.util.Scanner;

public class Menu {
    private Bank bank;

    public Menu(Bank bank) {
        this.bank = bank;
    }

    public static Menu createMenu(Bank bank) {
        return new Menu(bank);
    }

    public static Menu createMenu() {
        return new Menu(Bank.createBank("NJBank"));
    }

    public void actions(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(this.bank.getName() + " greets you!");
            System.out.printf("%s%n".repeat(5),
                    "1. Add a new customer",
                    "2. Add a new transaction",
                    "3. Print a statement about a customer",
                    "4. List customers",
                    "9. Exit");
            System.out.print(">");
            String input = scanner.nextLine();
            switch (input.toLowerCase()){
                case "1", "add a new customer", "new customer" -> this.bank.addCustomer();
                case "2", "add a new transaction", "new transaction" -> this.bank.addTransaction();
                case "3", "print a statement about a customer", "print statement", "statement" -> this.bank.printStatement();
                case "4", "list customers", "list" -> this.bank.listCustomers();
                default -> {}
            }
            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("9")){
                break;
            }
        }
    }
}
