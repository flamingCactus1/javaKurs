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
    }
}
