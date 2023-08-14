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
            char arithOperator = RandomStringUtils.random(1, operators).charAt(0);

            System.out.print("Question: ");
            generatorStrOfNumb(firstNumber, modNumber, arithOperator);

            int trueAnswer = 0;
            int userAnswer = UserInput.userInput();

            // Находим trueAnswer

            if (EndOutput.endOutput(trueAnswer, userAnswer, userName)) {
                return;
            }

        }
        System.out.println("Congratulations, " + userName);
    }

    private static void generatorStrOfNumb(int firstNumber, int modNumber, char arithOperator){
        int dots = (int) (Math.random() * 10 - 3);

        System.out.print(firstNumber + " ");
        for (int i = 0; i < 7; i++) {

            if (dots == i){
                System.out.print(".. ");
            } else {
                int result;
                if (arithOperator == '+') {
                    result = firstNumber + modNumber;
                } else {
                    result = firstNumber * modNumber;
                }
                System.out.print(result + " ");
                firstNumber = result;
            }
        }
        System.out.println();
    }
}
