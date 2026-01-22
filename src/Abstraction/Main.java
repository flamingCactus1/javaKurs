package Abstraction;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf", "big", 30);

        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Fish("Goldfish", "Small", 0.3));
        animals.add(new Dog("German Shepard", "big", 20.00));
        animals.add(new Fish("Barracuda", "Big", 5.00));
        animals.add(new Dog("Pug", "small", 10.00));
        animals.add(new Horse("Clydesdale", "Large", 300.00));
        animals.forEach(animal -> doAnimalStuff(animal));
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move(generateRandomSpeed());
        if (animal instanceof Mammal) {
            ((Mammal) animal).shedHair();
        }
    }

    private static String generateRandomSpeed() {
        int randomInteger = new Random().nextInt(2);
        if (randomInteger == 0) {
            return "slow";
        } else {
            return "fast";
        }
    }
}
