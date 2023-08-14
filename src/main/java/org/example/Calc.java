package org.example;

import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

public class Calc {
    public static void calc() {
        String userName = Greet.greet();
        System.out.println("What is the result of the expression?");

        for (var i = 0; i < 3; i++){
            Random random = new Random();
            int randomNumber1 = random.nextInt(101);
            int randomNumber2 = random.nextInt(11);
            String operators = "+-*/%";
            char arithOperator = RandomStringUtils.random(1, operators).charAt(0);

            System.out.println("Question: " + randomNumber1 + " " + arithOperator + " " + randomNumber2);

            System.out.print("You answer: " );
            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();
            scanner.nextLine();

            int trueAnswer = 0;
            switch (arithOperator) {
                case '+' -> trueAnswer = randomNumber1 + randomNumber2;
                case '-' -> trueAnswer = randomNumber1 - randomNumber2;
                case '*' -> trueAnswer = randomNumber1 * randomNumber2;
                case '/' -> trueAnswer = randomNumber1 / randomNumber2;
                case '%' -> trueAnswer = randomNumber1 % randomNumber2;
                default -> System.out.println("Invalid operator");
            }

            if (trueAnswer == userAnswer){
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + trueAnswer + "'"
                        + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName);
    }
}
