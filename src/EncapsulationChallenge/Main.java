package EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {
        Printer samsungPrinter = new Printer();
        Printer xeroxPrinter = new Printer(true);
        Printer brotherPrinter = new Printer(0, 2000, true);

        samsungPrinter.addTonerLevel(10);
        samsungPrinter.addTonerLevel(-20);
        samsungPrinter.printPages(20);
        System.out.println("Samsung printer has printed " + samsungPrinter.getPagesPrinted() + " pages.");

        xeroxPrinter.printPages(21);
        xeroxPrinter.printPages(-20);
        System.out.println("Xerox printer has printed " + xeroxPrinter.getPagesPrinted() + " pages");


        brotherPrinter.printPages(20);
        System.out.println("Brother printer has printed " + brotherPrinter.getPagesPrinted() + " pages");
    }
}
