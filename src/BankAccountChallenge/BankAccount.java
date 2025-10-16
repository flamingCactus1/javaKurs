package BankAccountChallenge;

public class BankAccount {
    int accountNumber;
    double balance;
    String name;
    String email;
    String phoneNumber;

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
        if(amount < 0) {
            return;
        }
        this.balance += amount;
    }
    public void withdrawFunds(double amount) {
        if(amount < 0 || this.balance < amount) {
            System.out.println(this.balance-amount<0?"Insufficient funds in the account" : "");
            return;
        }
        this.balance -= amount;
    }
}
