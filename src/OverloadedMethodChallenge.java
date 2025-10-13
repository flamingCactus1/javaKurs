public class OverloadedMethodChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(2));
        System.out.println(convertToCentimeters(3, 11));
    }

    public static double convertToCentimeters(int valueInInches) {
        return valueInInches * 2.54d;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return convertToCentimeters(heightInInches + (heightInFeet * 12));
    }
}
