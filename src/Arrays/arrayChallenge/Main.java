package Arrays.arrayChallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] testArray = new int[10];
        int[] testOddArray = new int[11];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(100);
        }
        for (int i = 0; i < testOddArray.length; i++) {
            testOddArray[i] = random.nextInt(100);
        }
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(testArray));
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(ArraySorter.sortInDescendingOrder(testArray)));
        System.out.println("Reversed Copy of the Original Array:");
        System.out.println(Arrays.toString(ArraySorter.reversedCopyOfIntegersArray(testArray)));
        System.out.println("Original Odd Array:");
        System.out.println(Arrays.toString(testOddArray));
        System.out.println("Sorted Odd Array:");
        System.out.println(Arrays.toString(ArraySorter.sortInDescendingOrder(testOddArray)));
        System.out.println("Reversed Copy of the Odd Array:");
        System.out.println(Arrays.toString(ArraySorter.reversedCopyOfIntegersArray(testOddArray)));


//        System.out.println("Provide a list of integer numbers separated by a comma");
//        System.out.print(">");
//        String userInput = scanner.next();
//        int[] arrayOfIntegers = NumbersTaker.takeNumbers(userInput);
//        System.out.println("Minimal value of provided integers:");
//        System.out.println(ArraySorter.findMinimalValue(arrayOfIntegers));
//        System.out.println("Sorted array of provided integers:");
//        System.out.println(Arrays.toString(ArraySorter.sortInDescendingOrder(arrayOfIntegers)));
    }
}
