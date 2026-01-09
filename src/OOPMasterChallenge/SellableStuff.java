package OOPMasterChallenge;

public class SellableStuff {
    private String name;
    private double pricing;

    public SellableStuff(String name, double pricing) {
        this.name = name;
        this.pricing = pricing;
    }

    public SellableStuff(){
        this("Default Dish", 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricing() {
        return pricing;
    }

    public void setPricing(double pricing) {
        this.pricing = pricing;
    }

    public void listSellableStuff() {
        System.out.println("=========================");
        System.out.println("Name: " + this.name);
        System.out.println("Pricing: " + this.pricing);
        System.out.println("=========================");
    }
}
