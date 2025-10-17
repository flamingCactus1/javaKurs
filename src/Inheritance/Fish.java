package Inheritance;

public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.print("muscles are moving ");
    }

    private void moveBackfin(){
        System.out.print("backfin is moving ");
    }

    public void move(String speed){
        super.move(speed);
        if(speed.equals("fast")){
            moveBackfin();
            System.out.println();
        }
        moveMuscles();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
