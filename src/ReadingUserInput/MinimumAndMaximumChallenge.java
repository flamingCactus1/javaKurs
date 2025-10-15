package ReadingUserInput;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Provide any number to proceed");
            System.out.println("Provide any character to exit");
            String choice = input.nextLine();
            try {
                minimum = Math.min(Integer.parseInt(choice), minimum);
                maximum = Math.max(Integer.parseInt(choice), maximum);
            }catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }


}
