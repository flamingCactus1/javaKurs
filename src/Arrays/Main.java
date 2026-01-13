package Arrays;

public class Main {

    public static void main(String[] args) {
        int[] integerArray = new int[10];

        //Size of an array is unchangeable

        double[] doubleArray = new double[10];

        doubleArray[2] = 3.5;
        doubleArray[3] = 4.5;
        doubleArray[4] = 5.5;
        System.out.println(doubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("firstTen array length: " + firstTen.length);
        System.out.println("first element of this array: " + firstTen[0]);
        System.out.println("last element of this array: " + firstTen[firstTen.length - 1]);
        int[] newArray;
        newArray = new int[]{1, 2, 3, 4, 5, 6, 7};
    }

}
