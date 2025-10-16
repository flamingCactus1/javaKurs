package BankAccountChallenge;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12, 500, "dany", "test@test.test", "+491111111111");
        System.out.println("Hi, " + bankAccount.getName() + ", welcome to the online banking, your BankID is " + bankAccount.getAccountNumber());
        System.out.println("Your bank balance is $" + bankAccount.getBalance());
        bankAccount.depositFunds(300);
        bankAccount.withdrawFunds(500);
    }
}
