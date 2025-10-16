package BankAccountChallenge;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(500);
        bankAccount.setAccountNumber(12);
        bankAccount.setName("Dany");
        bankAccount.setEmail("dany@dany.com");
        bankAccount.setPhoneNumber("+491111111111");

        bankAccount.depositFunds(300);
        bankAccount.withdrawFunds(500);
    }
}
