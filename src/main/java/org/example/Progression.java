package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    public static void progression() {
        String userName = Greet.greet();
        System.out.println("What number is missing in this progression?");

        for (var i = 0; i < 3; i++){
            Random random = new Random();
            int firstNumber = random.nextInt(11) + 1;
            int modNumber = random.nextInt(11) + 1;
            String operators = "+*";
            char arithOperator = RandomStringUtils.random(1, operators).charAt(0);

            generatorStrOfNumb(firstNumber, modNumber, arithOperator);
            return;

//            System.out.println("Question: " + firstNumber + " " + arithOperator + " " + modNumber);
//
//            System.out.print("You answer: " );
//            Scanner scanner = new Scanner(System.in);
//            int userAnswer = scanner.nextInt();
//            scanner.nextLine();
//
//            int trueAnswer = 0;
//
//
//            if (trueAnswer == userAnswer){
//                System.out.println("Correct!");
//            } else {
//                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
//                        + "'" + trueAnswer + "'"
//                        + "\nLet's try again, " + userName + "!");
//                return;
//            }
        }
        System.out.println("Congratulations, " + userName);
    }

    private static void generatorStrOfNumb(int firstNumber, int modNumber, char arithOperator){
        for (int i = 0; i < 8; i++) {
            int result;
            if (arithOperator == '+') {
                result = firstNumber + modNumber;
            } else {
                result = firstNumber * modNumber;
            }
            System.out.print(result + " ");
            firstNumber = result;
        }
        System.out.println();
    }
}
