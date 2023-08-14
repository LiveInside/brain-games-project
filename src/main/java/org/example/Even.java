package org.example;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        String userName = Greet.greet();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'");

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            boolean trueAnswer = randomNumber % 2 == 0;
            boolean userAnswer = answer.equals("yes");

            if (trueAnswer == userAnswer){
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(."
                        + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName);
    }
}
