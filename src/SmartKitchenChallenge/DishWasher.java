package SmartKitchenChallenge;

public class DishWasher extends Appliance {

    public DishWasher() {
        super(false);
    }

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes(){
        if (this.isHasWorkToDo()) {
            System.out.println("Dishes are being washed");
            this.setHasWorkToDo(false);
        }
    }

}
