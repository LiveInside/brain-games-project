package org.example;

public class EndOutput {

    public static boolean endOutput(boolean trueAnswer, boolean userAnswer, String userName) {
        String userAnswerStr = userAnswer ? "yes" : "no";
        String trueAnswerStr = trueAnswer ? "yes" : "no";

        if (trueAnswer == userAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswerStr + "'" + " is wrong answer ;(. Correct answer was "
                    + "'" + trueAnswerStr + "'"
                    + "\nLet's try again, " + userName + "!");
            return true;
        }
        return false;
    }

    public static boolean endOutput(int trueAnswer, int userAnswer, String userName) {
        if (trueAnswer == userAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                    + "'" + trueAnswer + "'"
                    + "\nLet's try again, " + userName + "!");
            return true;
        }
        return false;
    }
}
