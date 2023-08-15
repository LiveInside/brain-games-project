package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Progression {

    public static void progression() {
        String userName = Greet.greet();
        System.out.println("What number is missing in this progression?");

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int firstNumber = random.nextInt(10) + 1;
            int modNumber = random.nextInt(9) + 2;
            String operators = "+*";
            char arithOperator = RandomStringUtils
                    .random(1, operators)
                    .charAt(0);

            System.out.print("Question: ");

            int trueAnswer = generatorStrOfNumb(firstNumber,
                                                modNumber,
                                                arithOperator,
                                                random);
            int userAnswer = UserInput.userInput();

            if (EndOutput.endOutput(trueAnswer, userAnswer, userName)) {
                return;
            }

        }
        System.out.println("Congratulations, " + userName);
    }

    private static int generatorStrOfNumb(int firstNumber,
                                          final int modNumber,
                                          final char arithOperator,
                                          final Random random) {
        int dots = random.nextInt(8);
        int trueAnswer = 0;

        for (int i = 0; i < 8; i++) {

            if (dots == i) {
                System.out.print(".. ");
                trueAnswer = firstNumber;
            } else {
                System.out.print(firstNumber + " ");
            }

            if (arithOperator == '+') {
                firstNumber += modNumber;
            } else {
                firstNumber *= modNumber;
            }

        }
        System.out.println();
        return trueAnswer;
    }
}
