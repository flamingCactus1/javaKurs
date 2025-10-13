public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim!");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien");
            System.out.println("And i'm scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 80;
        if ((topScore >= secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score & less than top score!");
        }

        if ((topScore > 90) || (secondTopScore < 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("An error occurred");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("It is a car");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;

        String status = (isDomestic) ? "This car is domestic to our country" : "This car is imported to our country";

        System.out.println(status);

        double firstValue = 20.00, secondValue = 80.00, sum = (firstValue + secondValue)*100.00;
        boolean isDividableByFourty = (sum/40.00 == 0) ?  true : false;
        String result = isDividableByFourty ? "It is dividable by fourty" : "got some remainder";

        System.out.println(result);




    }
}
