package InheritanceChallenge;

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public Worker() {
        this("Undefined", "Undefined", "Undefined");
    }

    public int getAge() {
        int currentYear = 2025;
        return currentYear - getYear(this.birthDate);
    }

    private int getYear(String birthDate) {
        if((birthDate.startsWith("19") ||
        birthDate.startsWith("20")) &&
        birthDate.length() == 4 ) {
            return Integer.parseInt(birthDate);
        } else{
            return getYear(birthDate.substring(1));
        }
    }

    public double collectSalary(){
        return 0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
