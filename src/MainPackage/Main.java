package MainPackage;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent("" + i,
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
        }
        Student pojoStudent = new Student("s923006", "Ann", "05/11/1999", "Java Masterclass");
        Student pojoStudent2 = pojoStudent;
        LPAStudent recordStudent = new LPAStudent("s923007", "Bill", "05/11/1998", "Java Masterclass");
        System.out.println(recordStudent);
        System.out.println(pojoStudent);
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
