import java.util.Scanner;

public class AluraChallenge {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String name = "Chell";
            String accountType = "Checking Account";
            double balance = 1599.99;
            double transfer = 0;
            double receive = 0;
            int option = 0;
            String menu = """
                    ** Select an option **
                    1. View Balance
                    2. Transfer Value
                    3. Receive Value
                    4. Exit
                    """;

            System.out.println("\n*******************************");
            System.out.println("Name: " + name);
            System.out.println("Account Type: " + accountType);
            System.out.println("Balance: $" + String.format("%.2f", balance));
            System.out.println("*******************************\n");

            while (option != 4) {

                System.out.println(menu);
                option = scanner.nextInt();
                System.out.println(" ");
                switch (option) {
                    case 1:
                        System.out.println("Balance: $" + String.format("%.2f", balance) + "\n");
                        break;
                    case 2:
                        System.out.println("Currente Balance: $" + String.format("%.2f", balance));
                        System.out.println("Enter the amount you want to transfer:");
                        transfer = scanner.nextDouble();
                        if (transfer <= balance) {
                            balance -= transfer;
                            System.out.println("Congrats! You have just transferred $" + String.format("%.2f", transfer) + "\n");
                        } else {
                            System.out.println("\n !! ERROR: Insufficient Balance !!\n");

                        }
                        System.out.println("Current Balance: $" + String.format("%.2f", balance) + "\n");
                        break;
                    case 3:
                        System.out.println("Currente Balance: $" + String.format("%.2f", balance));
                        System.out.println("Enter the amount you want to receive:");
                        receive = scanner.nextDouble();
                        balance += receive;
                        System.out.println("Congrats! You have just received $" + String.format("%.2f", receive) + "\n");
                        System.out.println("Current Balance: $" + String.format("%.2f", balance) + "\n");
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("!! INVALID OPTION !! \n");
                }
            }
        }
        System.out.println(" The World Central Bank thanks you for your contact! \n  Thank you for your business\n");
    }
}
