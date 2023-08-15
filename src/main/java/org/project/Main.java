package org.project;

import org.project.braingames.*;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
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
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        switch (userChoice) {
            case 0 :
                return;
            case 1 :
                Greet.greet();
                break;
            case 2 :
                Even.even();
                break;
            case 3 :
                Calc.calc();
                break;
            case 4 :
                GCD.gcd();
                break;
            case 5 :
                Progression.progression();
                break;
            case 6 :
                Prime.prime();
                break;
            default:
                System.out.println("Invalid number");
        }
        scanner.close();
    }
}
