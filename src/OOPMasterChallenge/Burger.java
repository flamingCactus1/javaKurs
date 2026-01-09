package OOPMasterChallenge;

public class Burger extends SellableStuff {
    private boolean buns;
    private SellableStuff patty;
    private boolean salad;
    private boolean onion;
    private boolean sauce;
    private SellableStuff extra1;
    private SellableStuff extra2;
    private SellableStuff extra3;

    public Burger(String name, double price, boolean buns, SellableStuff patty, boolean salad, boolean onion, boolean sauce, SellableStuff extra1, SellableStuff extra2,  SellableStuff extra3) {
        super(name, price);
        this.buns = buns;
        this.patty = patty;
        this.salad = salad;
        this.onion = onion;
        this.sauce = sauce;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public Burger() {
        this("Default Burger", 5.0, true, new SellableStuff("beef", 0.0), true, true, true, new SellableStuff("none", 0.0), new SellableStuff("none", 0.0), new SellableStuff("none", 0.0));
    }

    public double getPrice() {
        return this.getPricing() + this.patty.getPricing() + this.extra1.getPricing() + this.extra2.getPricing() + this.extra3.getPricing();
    }

    public void listBurger(){
        System.out.println("=========================");
        System.out.println("Name: " + this.getName());
        System.out.println("Buns: " + (this.buns == true ? "yes" : "no"));
        System.out.println("Salad: " + (this.salad == true ? "yes" : "no"));
        System.out.println("Onion: " + (this.onion == true ? "yes" : "no"));
        System.out.println("Sauce: " + (this.sauce == true ? "yes" : "no"));
        System.out.println("Extra1: " + this.extra1.getName());
        System.out.println("Extra2: " + this.extra2.getName());
        System.out.println("Extra3: " + this.extra3.getName());
        System.out.println("Price: " + this.patty.getPricing());
        System.out.println("=========================");
    }

    public boolean isBuns() {
        return buns;
    }

    public SellableStuff getPatty() {
        return patty;
    }

    public boolean isSalad() {
        return salad;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isSauce() {
        return sauce;
    }

    public SellableStuff getExtra1() {
        return extra1;
    }

    public SellableStuff getExtra2() {
        return extra2;
    }

    public SellableStuff getExtra3() {
        return extra3;
    }

    public void setBuns(boolean buns) {
        this.buns = buns;
    }

    public void setPatty(SellableStuff patty) {
        this.patty = patty;
    }

    public void setSalad(boolean salad) {
        this.salad = salad;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public void setExtra1(SellableStuff extra1) {
        this.extra1 = extra1;
    }

    public void setExtra2(SellableStuff extra2) {
        this.extra2 = extra2;
    }

    public void setExtra3(SellableStuff extra3) {
        this.extra3 = extra3;
    }
}