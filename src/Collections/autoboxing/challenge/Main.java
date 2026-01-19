package Collections.autoboxing.challenge;

public class Main {
    public static void main(String[] args) {

        Bank bank = Bank.createBank("NJBank");
        Menu menu = Menu.createMenu(bank);

        menu.actions();

    }
}
