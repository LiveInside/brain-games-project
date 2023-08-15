package org.example;

import java.util.Random;
import org.apache.commons.math3.primes.Primes;

public class Prime {

    public static void prime() {
        String userName = Greet.greet();
        System.out.println("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);

            System.out.println("Question: " + randomNumber);

            boolean trueAnswer = Primes.isPrime(randomNumber);
            boolean userAnswer = UserInput.userInputStr().equals("yes");

            if (EndOutput.endOutput(trueAnswer, userAnswer, userName)) {
                return;
            }

        }
        System.out.println("Congratulations, " + userName);
    }
}
