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
        Scanner input = new Scanner(System.in);
        this.hireDate = "Undefined";
        System.out.println("Enter Employee ID");
        System.out.print("Employee ID: ");
        this.employeeId = input.nextLong();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
