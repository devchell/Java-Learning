package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.catalog.Episodes;
import br.com.alura.screenmatch.catalog.Movies;
import br.com.alura.screenmatch.catalog.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Movie (Star Wars)
        Movies starWars = new Movies("Star Wars - Episode 1", 1999);
        starWars.setDurationMin(136);
        starWars.setDirector("George Lucas");
        starWars.setIncludedPlan(true);
        starWars.evaluate(6);
        starWars.evaluate(7);
        starWars.evaluate(8);
        starWars.evaluate(7);
        starWars.evaluate(6);
        starWars.evaluate(4);
        starWars.evaluate(9);
        starWars.evaluate(9);
        starWars.evaluate(6);
        starWars.evaluate(4);
        starWars.evaluate(8);
        starWars.evaluate(9);
        starWars.evaluate(6);
        starWars.evaluate(7);
        starWars.evaluate(6);
        starWars.evaluate(9);
        starWars.movieDataSheet();

        //Movie (Taxi Driver)
        Movies taxiDriver = new Movies("Taxi Driver", 1976);
        taxiDriver.setDurationMin(114);
        taxiDriver.setDirector("Martin Scorsese");
        starWars.setIncludedPlan(false);
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(7);
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(10);
        taxiDriver.evaluate(8);
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(7);
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(7);
        taxiDriver.evaluate(8);
        taxiDriver.evaluate(8);
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(7);
        taxiDriver.evaluate(8);
        taxiDriver.movieDataSheet();

        //Series (Stranger Things)
        Series strangerThings = new Series("Stranger Things", 2016);
        strangerThings.setSeasons(4);
        strangerThings.setTotalEpisodes(33);
        strangerThings.setMinPerEp(70);
        strangerThings.setActive(false);
        starWars.setIncludedPlan(false);
        strangerThings.evaluate(10);
        strangerThings.evaluate(8);
        strangerThings.evaluate(6);
        strangerThings.evaluate(7);
        strangerThings.evaluate(7);
        strangerThings.evaluate(6);
        strangerThings.evaluate(5);
        strangerThings.evaluate(7);
        strangerThings.evaluate(6);
        strangerThings.evaluate(8);
        strangerThings.evaluate(7);
        strangerThings.evaluate(6);
        strangerThings.evaluate(9);
        strangerThings.evaluate(6);
        strangerThings.evaluate(7);
        strangerThings.evaluate(6);
        strangerThings.evaluate(8);
        strangerThings.serieDataSheet();

        //Series (Sherlock)
        Series sherlock = new Series("Sherlock", 2010);
        sherlock.setName("Sherlock");
        sherlock.setSeasons(3);
        sherlock.setTotalEpisodes(12);
        sherlock.setMinPerEp(50);
        sherlock.setActive(false);
        starWars.setIncludedPlan(false);
        sherlock.evaluate(7);
        sherlock.evaluate(10);
        sherlock.evaluate(2);
        sherlock.evaluate(5);
        sherlock.evaluate(7);
        sherlock.evaluate(9);
        sherlock.evaluate(8);
        sherlock.evaluate(7);
        sherlock.evaluate(6);
        sherlock.evaluate(8);
        sherlock.evaluate(9);
        sherlock.evaluate(10);
        sherlock.serieDataSheet();

        //Marathon
        TimeCalculator calculator = new TimeCalculator("Lista", 2023);
        calculator.include(starWars);
        calculator.include(taxiDriver);
        calculator.include(strangerThings);
        calculator.include(sherlock);
        System.out.println("\nYour list has " + calculator.getTotalMinutes() + " minutes.");
        System.out.println("You will need " + calculator.getTotalHours() + " hours to marathon it.\n");

        //Filter
        RecommendationFilter filter = new RecommendationFilter();
//        filter.filter(taxiDriver);
        Episodes episode = new Episodes();
        episode.setNum(1);
        episode.setSerie(strangerThings);
        episode.setViews(101);
        System.out.print("Overall Rating: ");
        filter.filter(episode);


        //ArrayList
        ArrayList<Movies> moviesArrayList = new ArrayList<>();
        moviesArrayList.add(starWars);
        moviesArrayList.add(taxiDriver);
        System.out.println("\nYour list has " + moviesArrayList.size() + " movies");
        System.out.println("Starting with ");
        System.out.println(moviesArrayList.get(0).toString());
        System.out.println("Full list: " + moviesArrayList);
    }
}
