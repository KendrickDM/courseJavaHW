package com.courseJava;

public class Pizza {

    public static String eatPizza(String answer) {

        String answerT = "Yes";
        String answerF = "No";

        if (answerT.equalsIgnoreCase(answer)) {
            System.out.printf("%s%n%s%n", "Making pizza!", "Wait 5 seconds...");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Pizza is ready!";
        } else if (answerF.equalsIgnoreCase(answer)) {
            return "Bye!";
        } else {
            return "Please try again!";
        }
    }
}
