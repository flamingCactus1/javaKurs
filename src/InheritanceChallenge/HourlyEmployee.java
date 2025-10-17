package InheritanceChallenge;

public class HourlyEmployee extends Employee {
    private double hourlySalary;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlySalary) {
        super(name, birthDate, endDate, employeeId, hireDate);
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
        return hourlySalary * 2;
    }
}
