package OOPMasterChallenge;

public class Drink extends SellableStuff{
    boolean ice;
    String size;

    public Drink(boolean ice, String size, String name, int pricing){
        super(name, pricing);
        this.ice = ice;
        this.size = size;
    }
    public Drink(){
        super("Coke", 4.2);
        this.ice = true;
        this.size = "Medium";
    }

    public Drink(String name, int pricing){
        super(name, pricing);
        this.ice = true;
        this.size = "Medium";
    }

    public void listDrink(){
        System.out.println("=========================");
        System.out.println("Name: " + this.getName());
        System.out.println("Ice: " + (this.ice == true ? "yes" : "no"));
        System.out.println("Size: " + this.size);
        System.out.println("Price: " + this.getPricing());
        System.out.println("=========================");
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
