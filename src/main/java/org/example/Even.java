package org.example;

import java.util.Random;

public class Even {
    public static void even() {
        String userName = Greet.greet();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);

            System.out.println("Question: " + randomNumber);

            boolean trueAnswer = randomNumber % 2 == 0;
            boolean userAnswer = UserInput.userInputStr().equals("yes");

            if (EndOutput.endOutput(trueAnswer, userAnswer, userName)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName);
    }
}
