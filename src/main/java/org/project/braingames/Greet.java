package org.project.braingames;

import java.util.Scanner;

public class Greet {
    public static String greet() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
