package br.com.alura.screenmatch.model;

public class Movie extends Title {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void movieDataSheet() {
        System.out.println("\nMovie: " + getName());
        System.out.println("Released Year: " + getYearReleased());
        System.out.println("Director: " + getDirector());
        System.out.println("Duration: " + getDurationMin() + " minutes");
        System.out.println("Rating: " + String.format("%.2f", averageRating()));
        System.out.println("Total Ratings: " + getTotalRating());
    }

}
