package MainPackage;

public class AllAboutStrings {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");
        String helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n%n", helloWorld.indexOf("r"));
        System.out.printf("Index of World is = %d %n%n", helloWorld.indexOf("World"));
        System.out.printf("First index of l = %d %n%n", helloWorld.indexOf("l"));
        System.out.printf("Last index of l = %d %n%n", helloWorld.lastIndexOf("l"));
        System.out.printf("First index of l = %d %n%n", helloWorld.indexOf("l",3));
        System.out.printf("Last index of l = %d %n%n", helloWorld.lastIndexOf("l",8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if (helloWorld.contains("World")){
            System.out.println("String contains World");
        }
        if (helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length: %d %n", length);
        if (!string.isEmpty()) {
            System.out.printf("First char: %c %n", string.charAt(0));
            System.out.printf("Last char: %c %n", string.charAt(length - 1));
        }
        System.out.println("This string is " + ((string.isEmpty() ? "" : "not ") + "empty"));
        System.out.println("This string is " + ((string.isBlank() ? "" : "not ") + "blank\n"));

    }
}
