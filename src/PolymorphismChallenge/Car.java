package PolymorphismChallenge;

public class Car {
    private String description;
    private boolean isRunning;

    public Car(String description) {
        this.description = description;
        this.isRunning = false;
    }

    public Car(){
        this("Just a normal car");
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void showStats(){
        System.out.println("Description: " + description);
    }

    public void start(){
        this.isRunning = true;
        System.out.println("Engine is running");
    }

    public void stop(){
        this.isRunning = false;
        System.out.println("Engine is stopped");
    }

    protected void runEngine(){
        System.out.println("The engine is running");
    }

    public void drive(){
        this.runEngine();
        System.out.println("The vehicle is moving");
    }

}
