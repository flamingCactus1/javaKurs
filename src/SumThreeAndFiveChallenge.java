public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        int result = 0, count = 0;
        for (int i = 1; count<=5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += i;
                count++;
                System.out.println("The number is " + i);
            }
            if(count == 5) break;
        }
        System.out.println("The result is " + result);
    }
}
