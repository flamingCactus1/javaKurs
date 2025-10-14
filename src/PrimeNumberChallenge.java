public class PrimeNumberChallenge {
    public static void main(String[] args) {
        for (int i = 0; i < 17; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "not ") + "a prime number");
        }
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
