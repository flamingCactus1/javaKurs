package SmartKitchenChallenge;

public class CoffeeMaker extends Appliance {

    public CoffeeMaker() {
        super(false);
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee(){
        if(this.isHasWorkToDo()){
            System.out.println("Coffee is brewing");
            System.out.println("Coffee is ready");
            this.setHasWorkToDo(false);
        }
    }
}
