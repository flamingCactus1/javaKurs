package EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel > 100 ? 100 : tonerLevel;
        if (tonerLevel < 0) {
            this.tonerLevel = 0;
        }
        this.pagesPrinted = pagesPrinted < 0 ? 0 : pagesPrinted;
        this.duplex = duplex;
    }

    public Printer() {
        this(100, 0, false);
    }

    public Printer(boolean duplex) {
        this(100, 0, duplex);
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public boolean isDuplex() {
        return this.duplex;
    }

    public void addTonerLevel(int tonerAmount) {
        if (tonerAmount < 0) {
            System.out.println("You can not add a negative amount of toner");
            return;
        }
        this.tonerLevel = (tonerAmount + this.tonerLevel) > 100 ? 100 : this.tonerLevel + tonerAmount;
        System.out.println("Toner Level: " + this.tonerLevel);
    }

    public void printPages(int pagesToPrint) {
        if (this.isDuplex()) {
            pagesToPrint = (pagesToPrint % 2 != 0) ? pagesToPrint / 2 + 1 : pagesToPrint / 2;
        }
        if (pagesToPrint <= 0 || this.tonerLevel <= 0) {
            System.out.println("No pages will be printed");
        } else {
            System.out.println(pagesToPrint + " pages will be printed");
            this.pagesPrinted += pagesToPrint;
            this.tonerLevel -= 1;
        }
    }
}
