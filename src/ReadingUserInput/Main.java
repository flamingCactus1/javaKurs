package ReadingUserInput;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2025;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hi, " + name + ", Thank you!");
        String dateOfBirth = System.console().readLine("Enter your year of birth: ");
        System.out.println("Hi, " + name + ", you are " + (currentYear - Integer.parseInt(dateOfBirth)) + " years old!");


        return "";
    }

    public static String getInputFromScanner(int currentYear) {

        return  "";
    }
}
