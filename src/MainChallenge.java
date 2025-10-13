public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("Your final score is " + finalScoreCalculation(gameOver, score, levelCompleted, bonus));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("Your final score is " + finalScoreCalculation(gameOver, score, levelCompleted, bonus));

    }

    public static int finalScoreCalculation(boolean gameOver, int score, int levelCompleted, int bonus) {

        int result = gameOver ? (score + (levelCompleted * bonus) + 1000) : null;

        return result;

    }

}
