package com.courseJava;

import java.util.Scanner;
import static com.courseJava.Pizza.eatPizza;

public class PizzaMain {

    public static void main(String[] args) {

        System.out.println("You want pizza?! Enter:(Yes/No)");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        System.out.println(eatPizza(answer));
    }
}
