package Polymorphism;

public class ScienceFiction extends Movie{

    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do a bad stuff",
                "Space guys chase the Aliens",
                "Planet blows up");
    }

    public void watchScienceFiction(){
        System.out.println("Watching Science Fiction");
    }
}
