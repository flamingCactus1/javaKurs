package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "27/10/2000";
        int startingIndex = birthDate.indexOf("2000");
        System.out.println("Starting index: " + startingIndex);
        System.out.println("Birth date: " + birthDate.substring(startingIndex));

        System.out.println("Birth month: " + birthDate.substring(3,5));

        String birthDay = "27";
        String birthMonth = "10";
        String birthYear = "2000";


        birthDate = String.join("/",  birthDay, birthMonth, birthYear);
        System.out.println(birthDate);
        String newDate = birthDay.concat("/").concat(birthMonth).concat("/").concat(birthYear);
        newDate = newDate.replace('/', '-');
        newDate = newDate.replace("-", "DelimiteR");
        newDate = newDate.replaceFirst("DelimiteR", "/");
        newDate = newDate.replaceAll("DelimiteR", "-");
        System.out.println(newDate);


        String newString = "ABC\n";
        newString = newString.repeat(3).indent(8);
        System.out.println(newString);
        System.out.println("_".repeat(20));
    }
}
