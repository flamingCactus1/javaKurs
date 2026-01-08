package Polymorphism;

import java.util.Scanner;

public class NextMain {
    public static void main(String[] args) {

//        Movie movie = Movie.getMovie("adventure", "Jaws");
//        movie.watchMovie();
//
//        Adventure jaws = (Adventure) Movie.getMovie("adventure", "Jaws");
//        jaws.watchMovie();
//
//        Object comedy = Movie.getMovie("comedy", "Airplane");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();
//
//        var airplane = Movie.getMovie("comedy", "Airplane");
//        airplane.watchMovie();
//
//        var plane = new Comedy("Airplane");
//        plane.watchComedy();

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a film to watch:");
        System.out.printf(".. %s%n".repeat(3),
                "Adventure",
                "Comedy",
                "Science Fiction");
        System.out.print(">");
        String response = input.nextLine();
        Object unknownObject = Movie.getMovie(response, "Untitled");
        if (unknownObject.getClass().getSimpleName().equalsIgnoreCase("comedy")){
            Comedy unknownComedy = (Comedy) unknownObject;
            unknownComedy.watchComedy();
        }else if (unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdvanture();
        } else if (unknownObject instanceof ScienceFiction scifi){
            scifi.watchScienceFiction();
        }else {
            System.out.println("Invalid data provided");
        }

    }
}
