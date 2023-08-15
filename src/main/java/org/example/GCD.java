package org.example;

import org.apache.commons.math3.util.ArithmeticUtils;

import java.util.Arrays;
import java.util.Random;

// Определение наибольшего общего делителя
public class GCD {
    public static void gcd() {
        String userName = Greet.greet();
        System.out.println("What is the greatest common divisor?");

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int sizeArray = random.nextInt(11);
            int[] randomNumbers = new int[sizeArray];

            System.out.print("Question: " );
            for (int j = 0; j < sizeArray; j++) {
                randomNumbers[j] = random.nextInt(101);
                System.out.print(randomNumbers[j] + " ");
            }

            int trueAnswer = findGcd(randomNumbers);
            int userAnswer = UserInput.userInput();

            if(EndOutput.endOutput(trueAnswer, userAnswer, userName)){
                return;
            }
        }
        System.out.println("Congratulations, " + userName);
    }

    private static int findGcd(int[] randomNumbers) {
        int gcd = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            gcd = ArithmeticUtils.gcd(gcd, randomNumbers[i]);
        }
        System.out.println();
        return gcd;
    }
}
