package org.example;

import org.apache.commons.math3.util.ArithmeticUtils;

import java.util.Random;

// Определение наибольшего общего делителя
public class GCD {
    public static void gcd() {
        String userName = Greet.greet();
        System.out.println("What is the greatest common divisor?");

        for (var i = 0; i < 3; i++){
            Random random = new Random();
            int randomNumber1 = random.nextInt(11);
            int randomNumber2 = random.nextInt(10);

            System.out.println("Quastion: " + randomNumber1 + " " + randomNumber2);

            int trueAnswer = ArithmeticUtils.gcd(randomNumber1, randomNumber2);
            int userAnswer = UserInput.userInput();

            if(EndOutput.endOutput(trueAnswer, userAnswer, userName)){
                return;
            }

        }
        System.out.println("Congratulations, " + userName);
    }
}
