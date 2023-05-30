package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.catalog.Movies;
import br.com.alura.screenmatch.catalog.Series;
import br.com.alura.screenmatch.catalog.Titles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithList {
    public static void main(String[] args) {

        Movies starWars = new Movies("Star Wars - Episode 1", 1999);
        starWars.evaluate(8);
        starWars.evaluate(7);
        starWars.evaluate(6);

        Movies taxiDriver = new Movies("Taxi Driver", 1976);
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(10);

        Series strangerThings = new Series("Stranger Things", 2016);
        strangerThings.evaluate(5);
        strangerThings.evaluate(9);

        Series sherlock = new Series("Sherlock", 2010);
        sherlock.evaluate(9);
        sherlock.evaluate(7);

        Movies m1 = starWars;
        Movies m2 = taxiDriver;
        Series s1 = strangerThings;
        Series s2 = sherlock;

        List<Titles> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(s1);
        list.add(s2);
        Collections.sort(list);
        for (Titles item: list) {
            System.out.println("\n" + item);
            if (item instanceof Movies movie && movie.averageRating() > 2) {
                System.out.println("Avarage Rating: " + movie.averageRating());
            }
        }

        ArrayList<String> searchByActor = new ArrayList<>();
        searchByActor.add("Ewan McGregor");
        searchByActor.add("Robert De Niro");
        searchByActor.add("Gaten Matarazzo");
        searchByActor.add("Benedect Cumberbatch");
        Collections.sort(searchByActor);
        System.out.println("\nActor list: " + searchByActor);

        list.sort(Comparator.comparing(Titles::getYearReleased));
        System.out.println("Year comparing: " + list);
    }
}
