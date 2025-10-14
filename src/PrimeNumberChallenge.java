public class PrimeNumberChallenge {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) counter++;
            if (counter == 3) {
                System.out.println("The counter reached a desired point on " + i);
                break;
            }
        }
        System.out.println("There are " + counter + " prime numbers");
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
