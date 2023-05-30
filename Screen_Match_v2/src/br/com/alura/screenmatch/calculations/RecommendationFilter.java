package br.com.alura.screenmatch.calculations;

public class RecommendationFilter {

    public void filter(Rating rated){
        if (rated.getRating() >= 4) {
            System.out.println("Top Trends");
        } else if (rated.getRating() >= 2) {
            System.out.println("Well rated");
        } else {
            System.out.println("Watch later");
        }
    }
}
