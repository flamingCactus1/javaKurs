package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("What movie do you wanna watch?");
            System.out.printf(".. %s%n".repeat(3),
                    "Adventure",
                    "Comedy",
                    "Science Fiction");
            System.out.println("Type exit to exit the program");
            System.out.print(">");
            String response = input.nextLine();
            System.out.println("");
            if (response.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.printf("Enter title \n>");
            String title = input.nextLine();
            Movie movie = Movie.getMovie(response, title);
            movie.watchMovie();
        }

    }

}
