package Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
//        player.health = 200;
//        player.looseHealth(11);
//        System.out.println("Remaining health: " + player.healthRemaining())
        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("The inital health is " + tim.healthRemaining());
        System.out.println("The weapon is " + tim.getWeapon());

        EnhancedPlayer tim2 = new EnhancedPlayer("Tim2", 200, "Sword");
        tim2.showStats();
    }
}
