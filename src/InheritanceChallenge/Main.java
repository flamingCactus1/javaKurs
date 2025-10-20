package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee john = new HourlyEmployee("John",
                "12.10.1985",
                "20.10.2028",
                "20.10.2025",
                17);

        SalariedEmployee walter = new SalariedEmployee("Walter",
                "31.01.1970",
                "27.11.2030",
                "20.10.2025",
                65000.00,
                false);

        System.out.println(walter);
        System.out.println(john);

        System.out.println("Walter is " + walter.getAge() + " years old");
        System.out.println("John is " + john.getAge() + " years old");

        System.out.println("Walter is making $" + walter.collectSalary() + " a year");
        System.out.println("John is making $" + john.collectSalary() + " an hour");

        walter.retire();
        john.collectDoubleSalary();


    }

}
