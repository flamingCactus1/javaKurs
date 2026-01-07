package SmartKitchenChallenge;

public class Refrigerator extends Appliance {

    public Refrigerator() {
        super();
    }

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood() {
        if (this.isHasWorkToDo()) {
            System.out.println("Food is ordered");
            this.setHasWorkToDo(false);
        }
    }
}
