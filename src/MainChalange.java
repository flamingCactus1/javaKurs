public class MainChalange {

    public static void main(String[] args) {

        System.out.println(finalScoreCalculation(true, 800, 5, 100));

    }

    public static String finalScoreCalculation(boolean gameOver, int score, int levelCompleted, int bonus) {

        String result = gameOver ? "Your final score was  " + (score + (levelCompleted * bonus)) + "\n" : "The game is not over yet";

        return result;

    }

}
