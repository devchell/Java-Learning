import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Series;

public class Main {
    public static void main(String[] args) {

        //Movie (Star Wars)
        Movie starWars = new Movie();
        starWars.setName("Star Wars - Episode 1");
        starWars.setYearReleased(1999);
        starWars.setDurationMin(136);
        starWars.setDirector("George Lucas");
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
        Movie taxiDriver = new Movie();
        taxiDriver.setName("Taxi Driver");
        taxiDriver.setYearReleased(1976);
        taxiDriver.setDurationMin(114);
        taxiDriver.setDirector("Martin Scorsese");
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(6);
        taxiDriver.evaluate(5);
        taxiDriver.evaluate(10);
        taxiDriver.evaluate(8);
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(7);
        taxiDriver.evaluate(6);
        taxiDriver.evaluate(7);
        taxiDriver.evaluate(7);
        taxiDriver.evaluate(7);
        taxiDriver.evaluate(9);
        taxiDriver.evaluate(6);
        taxiDriver.evaluate(8);
        taxiDriver.movieDataSheet();

        //Series (Stranger Things)
        Series strangerThings = new Series();
        strangerThings.setName("Stranger Things");
        strangerThings.setSeasons(4);
        strangerThings.setYearReleased(2016);
        strangerThings.setTotalEpisodes(33);
        strangerThings.setMinPerEp(70);
        strangerThings.setActive(false);
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
        Series sherlock = new Series();
        sherlock.setName("Sherlock");
        sherlock.setSeasons(3);
        sherlock.setYearReleased(2010);
        sherlock.setTotalEpisodes(12);
        sherlock.setMinPerEp(50);
        sherlock.setActive(false);
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
        TimeCalculator calculator = new TimeCalculator();
        calculator.include(starWars);
        calculator.include(taxiDriver);
        calculator.include(strangerThings);
        calculator.include(sherlock);
        System.out.println("\nYour list has " + calculator.getTotalMinutes() + " minutes.");
        System.out.println("You will need " + calculator.getTotalHours() + " hours to marathon it. ");
    }
}
