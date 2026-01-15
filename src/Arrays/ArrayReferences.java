package Arrays;

import java.util.Arrays;

public class ArrayReferences {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        int[] anotherArray = myIntArray;

        anotherArray[0] = 1;
        modifyArray(myIntArray);
        System.out.println("myIntArray" + Arrays.toString(myIntArray));
        System.out.println("anotherArray" + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[1] = 2;
    }
}
