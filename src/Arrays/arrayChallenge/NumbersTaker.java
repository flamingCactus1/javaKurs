package Arrays.arrayChallenge;

public class NumbersTaker {
    public static int[] takeNumbers(String string) {
        String[] strings = string.split(",");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }

}
