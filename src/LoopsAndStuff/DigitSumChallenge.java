package LoopsAndStuff;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int[] testArray = {125, 17654, 8876899, 1};
        for (int i = 0; i < testArray.length; i++) {
            System.out.println("The sum of the digits of a number " +
                    testArray[i] +
                    " is " +
                    sumDigits(testArray[i]));
        }
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) return -1;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
