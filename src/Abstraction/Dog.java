package Abstraction;

public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + (speed.equalsIgnoreCase("slow") ? " slowly walking" : " runs fast"));
    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("wolf")){
            System.out.println("Howling");
        }else {
            System.out.println("Woof");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType().concat(" sheds hair all the time"));
    }
}
