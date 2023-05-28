import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Guessing Game =====");
        String pVote;
        do {
            System.out.println(" ");
            System.out.println("Pleaser, select a number between 0 and 100");
            System.out.println(" ");
            int pChoice = scanner.nextInt();
            int mChoice = new Random().nextInt(100);
            System.out.println(" ");

                if (mChoice == pChoice) {
                    System.out.println("Yeah, " + pChoice + " is the number I was thinking of!");
                } else {
                    System.out.println("Sorry, but the number I was thinking of was " + mChoice);
                }

            System.out.println(" ");
            System.out.println("Want to continue? Y/N");
            pVote = scanner.nextLine();

        }
        while (!Objects.equals(pVote, "N"));

        scanner.close();
    }
}
