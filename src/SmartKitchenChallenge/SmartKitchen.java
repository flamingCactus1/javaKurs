package SmartKitchenChallenge;

import java.util.Scanner;

public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen() {
        this.iceBox = new Refrigerator();
        this.dishWasher = new DishWasher();
        this.brewMaster = new CoffeeMaker();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setIceBox(Refrigerator iceBox) {
        this.iceBox = iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public void addWater(){
        Scanner  input = new Scanner(System.in);
        String answer = new String();
        System.out.println("Water is added");
        System.out.println("Would you like to brew coffee now?");
        System.out.print("Y/N >");
        answer = input.next();
        if (answer.equalsIgnoreCase("Y")) {
            this.brewMaster.setHasWorkToDo(true);
            this.brewMaster.brewCoffee();
        }
    }

    public void loadDishWasher(){
        Scanner input = new Scanner(System.in);
        String answer = new String();
        System.out.println("Dishwasher is loaded");
        System.out.println("Would you like to start the washing cycle now?");
        System.out.print("Y/N >");
        answer = input.next();
        if (answer.equalsIgnoreCase("Y")) {
            this.dishWasher.setHasWorkToDo(true);
            this.dishWasher.doDishes();
        }
    }

    public void checkFridge(){
        Scanner input = new Scanner(System.in);
        String answer = new String();
        System.out.println("Fridge is empty");
        System.out.println("Would you like to order some food?");
        System.out.print("Y/N >");
        answer = input.next();
        if (answer.equalsIgnoreCase("Y")) {
            this.iceBox.setHasWorkToDo(true);
            this.iceBox.orderFood();
        }
    }

    public void setKitchenState(boolean dishwasherState, boolean coffeeMakerState, boolean fridgeState){
        this.dishWasher.setHasWorkToDo(dishwasherState);
        this.brewMaster.setHasWorkToDo(coffeeMakerState);
        this.iceBox.setHasWorkToDo(fridgeState);
    }

    public void doKitchenWork(){
        addWater();
        loadDishWasher();
        checkFridge();
    }

}
