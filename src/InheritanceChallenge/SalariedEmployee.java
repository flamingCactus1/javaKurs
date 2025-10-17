package InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary < 50000.00 ? 50000.00 : annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee() {
        super();
        this.annualSalary = 50000.00;
        this.isRetired = false;
    }

    @Override
    public double collectSalary() {
        return this.annualSalary;
    }

    public void retire(){
        this.isRetired = true;
    }
}
