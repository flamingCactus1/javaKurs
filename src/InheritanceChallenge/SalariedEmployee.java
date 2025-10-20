package InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, hireDate);
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
        this.endDate = "31.12.2025";
        System.out.println(this.name + " has been retired on " + endDate);
        this.isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", name='" + name + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
