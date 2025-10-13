public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        calculateScore(75);
        calculateScore("Dany", 56, 2);
        calculateScore();
        System.out.println(newScore);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score*1000;
    }

    public static int calculateScore(int score){
        return calculateScore("Guest", score);
    }

    public static int calculateScore(String playerName, int score, int multiplier){
        System.out.println("Player " + playerName + " scored " + (score * multiplier)+ " points!");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No player");
        return 0;
    }

}
