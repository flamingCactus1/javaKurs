public class MainChallenge {

    public static void main(String[] args) {
        int[] scores = {1500, 1000, 500, 100, 25};
        String[] names = {"Alex", "Dany", "Mindy", "Alex", "Disco"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(displayHighScorePosition(names[i], scores[i]));
        }
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

    public static String displayHighScorePosition(String name, int score) {
        if (calculateHighScorePosition(score) != 4) {
            return (name + " managed to get to the " + calculateHighScorePosition(score) + " position on a high score list.");
        } else {
            return "Srry, bud, next time";
        }

    }
}
