package br.com.alura.screenmatch.catalog;

import br.com.alura.screenmatch.calculations.Rating;

public class Movies extends Titles implements Rating {

    private String director;

    public Movies(String name, int yearReleased) {
        super(name, yearReleased);
    }

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

    @Override
    public int getRating() {
        return (int) averageRating()/2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + getYearReleased() + ")";
    }
}
