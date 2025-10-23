package SmartKitchenChallenge;

public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Dishes are done");
            hasWorkToDo = false;
        }
    }
}
