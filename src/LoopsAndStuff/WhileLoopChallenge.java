package LoopsAndStuff;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int i = 5, counterOfEvenNumbers = 0;
        while (i <= 20 &&  counterOfEvenNumbers < 5) {
            if (isEvenNumber(i)) {
                System.out.println(i + " is an even number");
                counterOfEvenNumbers++;
            }
            i++;
        }
        System.out.println("The amount of even numbers is " + counterOfEvenNumbers);
        System.out.println("The number of odd numbers is " + (15 - counterOfEvenNumbers));
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
