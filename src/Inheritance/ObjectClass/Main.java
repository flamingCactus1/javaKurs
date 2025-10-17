package Inheritance.ObjectClass;

public class Main extends Object {
    public static void main(String[] args) {

        Student max = new Student("max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("jimmy", 10, "Carol");
        System.out.println(jimmy);
    }
}
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public String toString() {
//        return this.name + " " + this.age;
//    }

    @Override
    public String toString() {
        return name + " is " + age +  " years old";
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    @Override
    public String toString() {
        return super.toString() + " and his parent is " + parentName;
    }

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;


    }
}