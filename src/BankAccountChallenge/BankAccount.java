package BankAccountChallenge;

public class BankAccount {
    int accountNumber;
    double balance;
    String name;
    String email;
    String phoneNumber;

    public BankAccount() {
        this(2323, 0, "undefined", "undefined", "undefined");
        System.out.println("Empty constructor is called");
    }
    public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber) {
        System.out.println("Account constructor with args is called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this(12222, 0, name, email, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        if (amount < 0) {
            System.out.println("Invalid data");
            return;
        }
        this.balance += amount;
        System.out.println("Deposit of $" + amount + " is processed, new balance is $" + this.balance);
    }

    public void withdrawFunds(double amount) {
        if (amount < 0 || this.balance < amount) {
            System.out.println(this.balance - amount < 0 ? "Insufficient funds in the account, your balance is $" + this.balance : "Invalid data");
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrawal of $" + amount + " is processed, remaining balance is $" + this.balance);
    }
}
