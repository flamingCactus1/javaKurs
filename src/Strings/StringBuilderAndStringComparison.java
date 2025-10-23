package Strings;

public class StringBuilderAndStringComparison {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        StringBuilder builder = new StringBuilder("Hello " + "World");


        helloWorld.concat(" and Goodbye");
        builder.append(" and Goodbye");
        printInformation(helloWorld);
        printInformation(builder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello " + "World");
        builderPlus.append(" and Goodbye");
        builderPlus.replace(16, 17, "g");
        System.out.println(builderPlus);
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String: " + string);
        System.out.println("Length: " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder: " + builder);
        System.out.println("Length: " + builder.length());
        System.out.println("Capacity: " + builder.capacity());
    }
}
