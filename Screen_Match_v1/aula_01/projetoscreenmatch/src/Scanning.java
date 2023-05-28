import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {

        Scanner scanning = new Scanner(System.in);

        System.out.println("What's your favorite movie?");
        String movie = scanning.nextLine();
        System.out.println("Wow! " + movie + " is a awesome movie!");

        System.out.println(" ");

        System.out.println("Do you know the year this movie was released?");
        int yearReleased = scanning.nextInt();
        System.out.println(movie + " was released in " + yearReleased + ", perfect!");

        System.out.println(" ");

        System.out.println("What rating would you give the movie: " + movie + "? 0 - 10");
        double rating = scanning.nextDouble();
        System.out.println("Your rating to movie: " + movie + " is " + rating);

        scanning.close();

    }
}
