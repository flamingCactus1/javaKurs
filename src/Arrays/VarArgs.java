package Arrays;

public class VarArgs {
    public static void main(String... args) {

        System.out.println("Hello World");
        String[] splitString = "Hello World again".split(" ");
        printText(splitString);
        System.out.println("_".repeat(20));
        printText("Hello World once again");
        System.out.println("_".repeat(20));
        printText("Hello", "World", "one", "more", "time");
        printText();
        System.out.println("_".repeat(20));

        String[] stringArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", stringArray));
    }

    private static void printText(String... textList) {
        for(String text : textList) {
            System.out.println(text);
        }
    }
}
