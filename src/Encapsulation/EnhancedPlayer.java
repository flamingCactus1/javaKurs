package Encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName.isBlank() ? "Guest" : fullName;
        this.healthPercentage = healthPercentage > 0 ? healthPercentage : 1;
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
        this.weapon = weapon.isBlank() ? "Standard Weapon" : weapon;
    }

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Standard Weapon");
    }

    public void looseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            System.out.println("You lost!");
        }
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public String getWeapon(){
        return this.weapon;
    }

    public void restoreHealth(int extraHealth) {
        this.healthPercentage += extraHealth;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
            System.out.println("You restored 100% of an hp!");
        } else {
            System.out.println("Your hp is " + this.healthPercentage);
        }
    }

    public void showStats(){
        System.out.println("Name: " + this.fullName);
        System.out.println("Health: " + this.healthPercentage);
        System.out.println("Weapon: " + this.weapon);
    }


}
