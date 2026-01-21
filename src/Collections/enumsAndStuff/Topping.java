package Collections.enumsAndStuff;

public enum Topping {

    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){
        return switch (this){
            case MUSTARD -> 0.00;
            case PICKLES, TOMATO -> 1.00;
            case BACON -> 2.00;
            case CHEDDAR -> 3.00;
        };
    }

    public String getNameNormalCase(){
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
