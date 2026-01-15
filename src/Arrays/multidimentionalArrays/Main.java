package Arrays.multidimentionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] arrayOfIntegers = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = 0; j < arrayOfIntegers[i].length; j++) {
                arrayOfIntegers[i][j] = random.nextInt(100);
            }
        }
        arrayOfIntegers[1] = new int[]{1, 2, 3};

        for (int[] outer :  arrayOfIntegers) {
            System.out.println(Arrays.toString(outer));
        }

        System.out.println();

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            var innerArray = arrayOfIntegers[i];
            for (int inner : innerArray) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (var outer : arrayOfIntegers) {
            for (var inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println(Arrays.deepToString(arrayOfIntegers));
    }
}
