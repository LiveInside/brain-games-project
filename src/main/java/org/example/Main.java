package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        switch (userChoice) {
            case 0 :
                System.out.println("Your choice: " + userChoice);
                return;
            case 1 :
                System.out.println("Your choice: " + userChoice);
                Greet.greet();
                break;
            case 2 :
                System.out.println("Your choice: " + userChoice);
                Even.even();
                break;
            case 3 :
                System.out.println("Your choice: " + userChoice);
                Calc.calc();
                break;
            case 4 :
                System.out.println("Your choice: " + userChoice);
                GCD.gcd();
                break;
            case 5 :
                System.out.println("Your choice: " + userChoice);
                Progression.progression();
                break;
            case 6 :
                System.out.println("Your choice: " + userChoice);
                Prime.prime();
                break;
        }
        scanner.close();
    }
}