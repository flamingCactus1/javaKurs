package Arrays.arrayChallenge;

import java.util.Arrays;

public class ArraySorter {

    public static int[] sortInDescendingOrder(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return arrayToSort;
        } else {
            int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
            int temp;
            for (int i = 0; i < sortedArray.length; i++) {
                for (int j = i; j < sortedArray.length; j++) {
                    if (sortedArray[i] < sortedArray[j]) {
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[j];
                        sortedArray[j] = temp;
                    }
                }
            }
            return sortedArray;
        }
    }

    public static int findMinimalValue(int[] numbers) {
        int minimalValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            minimalValue = Math.min(minimalValue, numbers[i]);
        }
        return minimalValue;
    }

    public static void reverseArray(int[] arrayOfIntegers) {
        int middleOfArray = arrayOfIntegers.length / 2;
        for (int i = 0; i < middleOfArray; i++) {
            int temp = arrayOfIntegers[i];
            arrayOfIntegers[i] = arrayOfIntegers[arrayOfIntegers.length - i - 1];
            arrayOfIntegers[arrayOfIntegers.length - i - 1] = temp;
        };
    }

    public static int[] reversedCopyOfIntegersArray(int[] arrayOfIntegers) {
        int[] reversedArray = Arrays.copyOf(arrayOfIntegers, arrayOfIntegers.length);
        reverseArray(reversedArray);
        return reversedArray;
    }
}