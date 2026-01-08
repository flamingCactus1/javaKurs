package Encapsulation;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("You lost!");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

    public void restoreHealth(int extraHealth){
        this.health += extraHealth;
        if (this.health > 100){
            this.health = 100;
            System.out.println("You restored 100% of an hp!");
        } else {
            System.out.println("Your hp is " + this.health);
        }
    }
}
