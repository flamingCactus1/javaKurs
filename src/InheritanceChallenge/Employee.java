package InheritanceChallenge;

import java.util.Scanner;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;
    private static int employeeNr = 1;

    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = Employee.employeeNr++;
        this.hireDate = hireDate;
    }

    public Employee() {
        super();
        this.hireDate = "Undefined";
        this.employeeId = Employee.employeeNr++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
