package Arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 10);
        System.out.println(Arrays.toString(secondArray));
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] names = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        if (Arrays.binarySearch(names, "Mark") >= 0) {
            System.out.println("Mark is found");
        }

        int[] values = {1, 2, 3, 4, 5};
        int[] values2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(values, values2)) {
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }


    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

}
