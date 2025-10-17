package MainPackage;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Student s = new Student("" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/2000",
                    "Math");
            System.out.println(s.toString());
            System.out.println(s);
        }
    }
}
