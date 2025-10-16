public class Car {

    private String manufacturer;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar(){
        System.out.println(getManufacturer() + " " +
                getColor() + " " +
                getModel() + " " +
                getDoors() + "-Doors " +
                (getConvertible()? " Convertible": ""));
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer == null || manufacturer.isEmpty()) { manufacturer = "Unknown"; }
        switch (manufacturer) {
            case "Audi", "BMW", "Mercedes", "Porsche", "Volkswagen", "Opel" -> this.manufacturer = manufacturer;
            default -> this.manufacturer = "Unsupported";
        }
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getDoors() {
        return doors;
    }
    public boolean getConvertible() {
        return convertible;
    }
    public Car(){
        setManufacturer("BMW");
        setModel("X1");
        setColor("Red");
        setDoors(5);
        setConvertible(true);

    }
    public Car(String manufacturer, String model, String color, int doors) {
        setManufacturer(manufacturer);
        setModel(model);
        setColor(color);
        setDoors(doors);
        setConvertible(true);
    }

}
