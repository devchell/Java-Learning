import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);

        double evaluation = 0;
        double rating = 0;
        int totalScore = 0;


        while (rating != -1) {
            System.out.println("Rate this movie or -1 to stop");
            rating = scanning.nextDouble();

            if (rating != -1) {
                evaluation += rating;
                totalScore++;
            }
        }
        System.out.println("Avarage rate: " + evaluation/totalScore);
        
        scanning.close();
    }
}

