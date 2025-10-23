package ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208",
                "Dell",
                "240");
        Monitor monitor = new Monitor("27 inch beast",
                "Acer",
                27,
                "2540 x 1440");
        Motherboard motherboard = new Motherboard("BJ-200",
                "Asus",
                4,
                6,
                "v2.44");

        PersonalComputer personalComputer = new PersonalComputer("2208",
                "Dell",
                computerCase,
                monitor,
                motherboard);

        personalComputer. powerUp();

    }
}
