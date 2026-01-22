package Abstraction;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + (speed.equalsIgnoreCase("slow") ? " lazily swimming" : " darting frantically"));
    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("goldfish")){
            System.out.println("swish");
        } else{
            System.out.println("bulb");
        }
    }
}
