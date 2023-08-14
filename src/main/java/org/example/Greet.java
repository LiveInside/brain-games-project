package org.example;

import java.util.Scanner;

public class Greet {
    public static void greet() {
        System.out.print("Welcome to the Brain Games!\n" +
                "May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
