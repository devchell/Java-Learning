package com.chell.shopping.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Shoppingtron 3000 =======\n");

        while (option != 0) {
            System.out.println("Want to continue your shopping?\n1 - Yes\n0 - Exit");
            System.out.print("Option: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Product: ");
            }
        }
    }
}
