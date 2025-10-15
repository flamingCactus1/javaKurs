package ReadingUserInput;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counterOfProvidedNumbers = 1;

        do{
            System.out.println("Please provide a number #" +  counterOfProvidedNumbers);
            System.out.println("Please note, that the number must be not less than 0 and not greater than 100");
            System.out.print("->");
            String number = input.nextLine();
            try{
                if(isValid(Integer.parseInt(number))){
                    sum += Integer.parseInt(number);
                    counterOfProvidedNumbers++;
                }else {
                    System.out.println("Please enter a valid number");
                }
            }catch(NumberFormatException e){
                System.out.println("Please enter a valid number");
            }
        }while(counterOfProvidedNumbers <=5);

        System.out.println("The sum of provided numbers is " + sum);

    }

    public static boolean isValid(int number){
        return number >= 0 && number <= 100;
    }
}
