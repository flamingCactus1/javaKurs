package Polymorphism;

public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("adventure", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("adventure", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("comedy", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("comedy", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
