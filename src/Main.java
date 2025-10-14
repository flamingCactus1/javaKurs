public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++)
//            System.out.println(i);
//
//        int j = 1;
//        boolean isReady = false;
//        do {
//            j++;
//            System.out.println(j);
//        }while (isReady);
        int number = 0;
        while (number < 50) {
            number = number + 5;
            if(number % 25 == 0) continue;
            System.out.println(number);
        }
    }
}
