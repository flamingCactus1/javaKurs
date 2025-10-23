package MainPackage;

public class TextBlocks {
    public static void main(String[] args) {
        String bullet = "Print a bullet list: \n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point ";

        System.out.println(bullet);

        String textBlock = """
                Print a bullet list:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 25;
        System.out.printf("age = %d\n", age);
        System.out.printf("age = %.2f%n", (float) age);

        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d%nYear of Birth = %d%n", yearOfBirth, age);
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
