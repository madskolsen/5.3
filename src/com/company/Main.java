package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Giv n en value: ");
        Scanner scanner = new Scanner(System.in);
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double n = scanner.nextDouble();

        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }

    }
}

