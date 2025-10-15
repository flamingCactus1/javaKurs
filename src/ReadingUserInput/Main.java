package ReadingUserInput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2025;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hi, " + name + ", Thank you!");
        String dateOfBirth = System.console().readLine("Enter your year of birth: ");
        System.out.println("Hi, " + name + ", you are " + (currentYear - Integer.parseInt(dateOfBirth)) + " years old!");


        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi, " + name + ", Thank you!");

        boolean validDateOfBirth = false;
        int age = 0;
        do {
            System.out.println("Enter your year of birth: ");
            String dateOfBirth = input.nextLine();
            try {
                age = checkData(currentYear, dateOfBirth);
                validDateOfBirth = age != -1;
            } catch (NumberFormatException e) {
                System.out.println("characters are not allowed");
            }
            if (!validDateOfBirth) {
                System.out.println("That is some serious BS");
            }
        } while (!validDateOfBirth);
        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }
}
