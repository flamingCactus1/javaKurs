package BankAccountChallenge;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12, 500, "dany", "test@test.test", "+491111111111");

        System.out.println("Hi, " + bankAccount.getName() + ", welcome to the online banking, your BankID is " + bankAccount.getAccountNumber());
        System.out.println("Your bank balance is $" + bankAccount.getBalance());
        bankAccount.depositFunds(300);
        bankAccount.withdrawFunds(500);

        BankAccount undefindedUserAccount = new BankAccount();

        System.out.println("Name: " + undefindedUserAccount.getName());
        System.out.println("Balance: " + undefindedUserAccount.getBalance());
        System.out.println("Account Number: " + undefindedUserAccount.getAccountNumber());
        System.out.println("Email: " + undefindedUserAccount.getEmail());
        System.out.println("Phone Number: " + undefindedUserAccount.getPhoneNumber());
        undefindedUserAccount.depositFunds(500);
        undefindedUserAccount.withdrawFunds(500);

        BankAccount TomsBankAccount = new BankAccount("Tom", "tom@tom.tom", "+492222222222");
        System.out.println("Name: " + TomsBankAccount.getName());
        System.out.println("Balance: " + TomsBankAccount.getBalance());
        System.out.println("Account Number: " + TomsBankAccount.getAccountNumber());
        System.out.println("Email: " + TomsBankAccount.getEmail());
        System.out.println("Phone Number: " + TomsBankAccount.getPhoneNumber());
        TomsBankAccount.depositFunds(500);
        TomsBankAccount.withdrawFunds(500);

    }
}
