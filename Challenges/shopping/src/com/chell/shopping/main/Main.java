package com.chell.shopping.main;

import com.chell.shopping.creditcard.CreditCard;
import com.chell.shopping.creditcard.Shopping;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your card limit: $");
        double limit = scanner.nextDouble();

        CreditCard card = new CreditCard(limit);

        int option = 1;

        System.out.println("\n\n============= Shoppingtron 3000 =============");

        while (option != 0) {

            System.out.print("\nName the product: ");
            String productName = scanner.next();

            System.out.println("\nEnter the value of the product (" + productName + ")");
            System.out.print("$");
            double value = scanner.nextDouble();

            Shopping shopping = new Shopping(productName, value);
            boolean sucessShopping = card.postPurchase(shopping);

            if (sucessShopping) {
                System.out.println("\nSucess Purchase!");
                System.out.println("\nWant to continue your shopping?\n1 - Yes\n0 - Exit");
                System.out.print("Option: ");
                option = scanner.nextInt();
            } else {
                System.out.println("\nInsufficient Balance!");
                option = 0;
            }
        }

        scanner.close();

        System.out.println("\n==================== CART ===================\n");

        Collections.sort(card.getShopping());
        for (Shopping shopping : card.getShopping()) {
            System.out.println(shopping.getProductName() + " - $" + shopping.getValue());
        }
        System.out.println("\n=============================================\n");
        System.out.println("New balance: $" + card.getBalance());
    }
}
