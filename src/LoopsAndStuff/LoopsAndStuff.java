package LoopsAndStuff;

public class LoopsAndStuff {

    public static void main(String[] args) {
        for (int counter = 0; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double i = 9; i < 10; i += 0.25) {
            System.out.println("The interest of $10,000 at the " +
                    i +
                    " interest rate is $" +
                    calculateInterest(10000.00, i));
        }

        for (double i = 7.5; i <= 10; i += 0.25) {
            System.out.println("The interest rate of $100 at the " +
                    i +
                    " interest rate is $" +
                    calculateInterest(100.00, i));
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
