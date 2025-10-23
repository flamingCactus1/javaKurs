package SmartKitchenChallenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Coffee is brewing");
            hasWorkToDo = false;
        }
    }
}
