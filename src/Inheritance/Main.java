package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        final String SPEED = "20";

        doAnimalStuff(animal, SPEED);

        Dog dog = new Dog();
        doAnimalStuff(dog, SPEED);

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, SPEED);

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, SPEED);



    }

    public static void doAnimalStuff(Animal animal, String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
