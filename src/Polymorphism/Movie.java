package Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title.isBlank() ? "Untitled" : title;
    }

    public Movie(){
        this("");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

    public String getTitle() {
        return title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        System.out.println(this.title + " is a " + instanceType + " film");

    }
}
