package InheritanceChallenge;

public class HourlyEmployee extends Employee {
    private double hourlySalary;

    public HourlyEmployee(String name, String birthDate, String endDate, String hireDate, double hourlySalary) {
        super(name, birthDate, endDate, hireDate);
        this.hourlySalary = hourlySalary < 15.00 ? 15.00 : hourlySalary;
    }

    public HourlyEmployee() {
        super();
        this.hourlySalary = 15.00;
    }

    @Override
    public double collectSalary() {
        return hourlySalary;
    }

    public double collectDoubleSalary() {
        System.out.println(this.name + " has collected double salary, which is $" + (2 * this.hourlySalary) );
        return hourlySalary * 2;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlySalary=" + hourlySalary +
                ", name='" + name + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
