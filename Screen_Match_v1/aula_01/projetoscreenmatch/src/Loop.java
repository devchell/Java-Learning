import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner scanning = new Scanner(System.in);

        double evaluation = 0;
        double rating = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Rate this movie");
            rating = scanning.nextDouble();
            evaluation += rating;
        }

        System.out.println("Avarage rate: " + evaluation/3);

        scanning.close();
    }
}
