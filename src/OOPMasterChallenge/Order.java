package OOPMasterChallenge;

import java.util.Scanner;

public class Order {
    private Burger burger;
    private Drink drink;
    private SellableStuff sideDish;

    public Order(Burger burger, Drink drink, SellableStuff sideDish) {
        this.burger = burger;
        this.drink = drink;
        this.sideDish = sideDish;
    }

    public Order() {
        this(new Burger(), new Drink(), new SellableStuff());
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

    public void listOrder() {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Burger");
        this.burger.listBurger();
        System.out.println("Drink");
        this.drink.listDrink();
        System.out.println("SideDish");
        this.sideDish.listSellableStuff();
        System.out.println("+++++++++++++++++++++++++");
    }



    public void chooseBurger(Menu menu) {
        Scanner input = new Scanner(System.in);
        menu.listBurgers();
        System.out.println("=========================");
        System.out.println("Please enter the burger");
        System.out.print(">");
        String burgerName = input.nextLine();
        this.burger = menu.getBurgers().stream()
                .filter(burger -> burger.getName().equalsIgnoreCase(burgerName))
                .findFirst()
                .orElse(null);
        if (this.burger == null) {
            System.out.println("Burger with name " + burgerName + " not found");
        } else {
            System.out.println("Would you like to add or change toppings?");
            System.out.print("Y/N>");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                this.burger.editToppings(menu);
            }
        }
        System.out.println("=========================");
    }

    public void chooseDrink(Menu menu) {
        Scanner input = new Scanner(System.in);
        menu.listDrinks();
        System.out.println("=========================");
        System.out.println("Please enter the drink");
        System.out.print(">");
        String drinkName = input.nextLine();
        this.drink = menu.getDrinks().stream()
                .filter(drink -> drink.getName().equalsIgnoreCase(drinkName))
                .findFirst()
                .orElse(null);
        if (this.drink == null) {
            System.out.println("Drink with name " + drinkName + " not found");
        } else {
            System.out.println("Would you like to change the size or remove ice?");
            System.out.print("Y/N>");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                this.drink.editDrink();
            }
        }
        System.out.println("=========================");
    }

    public void chooseSideDish(Menu menu) {
        Scanner input = new Scanner(System.in);
        menu.listSideDishes();
        menu.listDrinks();
        System.out.println("=========================");
        System.out.println("Please enter the side dish");
        System.out.print(">");
        String sideDishName = input.nextLine();
        this.sideDish = menu.getSideDishes().stream()
                .filter(sideDish -> sideDish.getName().equalsIgnoreCase(sideDishName))
                .findFirst()
                .orElse(null);
        if (this.sideDish == null) {
            System.out.println("Drink with name " + sideDishName + " not found");
        }
        System.out.println("=========================");
    }

    public static Order placeOrder(Menu menu){
        Order order = new Order();
        order.chooseDrink(menu);
        order.chooseSideDish(menu);
        order.chooseDrink(menu);
        return order;
    }


}
