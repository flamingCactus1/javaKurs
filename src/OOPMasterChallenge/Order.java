package OOPMasterChallenge;

public class Order {
    private Burger burger;
    private Drink drink;
    private SellableStuff sideDish;

    public Order(Burger burger, Drink drink, SellableStuff sideDish) {
        this.burger = burger;
        this.drink = drink;
        this.sideDish = sideDish;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public SellableStuff getSideDish() {
        return sideDish;
    }

    public void setSideDish(SellableStuff sideDish) {
        this.sideDish = sideDish;
    }
}
