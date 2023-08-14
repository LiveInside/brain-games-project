package org.example;

import java.util.Scanner;

public class UserInput {

    public static String userInputStr(){
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int userInput(){
        System.out.print("You answer: " );
        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();
        scanner.nextLine();
        return userAnswer;
    }
}
