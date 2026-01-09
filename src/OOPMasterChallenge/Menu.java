package OOPMasterChallenge;

import java.util.LinkedList;

public class Menu {
    private LinkedList<Burger> burgers;
    private LinkedList<Drink> drinks;
    private LinkedList<SellableStuff> sideDishes;
    private LinkedList<SellableStuff> extras;

    public Menu(LinkedList<Burger> burgers, LinkedList<Drink> drinks, LinkedList<SellableStuff> sideDishes, LinkedList<SellableStuff> extras) {
        this.burgers = burgers;
        this.drinks = drinks;
        this.sideDishes = sideDishes;
        this.extras = extras;
    }

    public LinkedList<Burger> getBurgers() {
        return burgers;
    }

    public void setBurgers(LinkedList<Burger> burgers) {
        this.burgers = burgers;
    }

    public LinkedList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(LinkedList<Drink> drinks) {
        this.drinks = drinks;
    }

    public LinkedList<SellableStuff> getSideDishes() {
        return sideDishes;
    }

    public void setSideDishes(LinkedList<SellableStuff> sideDishes) {
        this.sideDishes = sideDishes;
    }

    public LinkedList<SellableStuff> getExtras() {
        return extras;
    }

    public void setExtras(LinkedList<SellableStuff> extras) {
        this.extras = extras;
    }

    public void listBurgers() {
        this.burgers.forEach(Burger::listBurger);
    }

    public void listDrinks() {
        this.drinks.forEach(Drink::listDrink);
    }

    public void listExtras() {
        this.extras.forEach(SellableStuff::listSellableStuff);
    }

    public void listSideDishes() {
        this.sideDishes.forEach(SellableStuff::listSellableStuff);
    }
}
