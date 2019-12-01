package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój dochód");
        int dochód = scanner.nextInt();

        double podatek;

        if (dochód>1000000) {
            podatek = dochód * 0.55;
            System.out.println("Twój podatek to: " + podatek);
        }
        else if (dochód>90000) {
            podatek = dochód * 0.5;
            System.out.println("Twój podatek to: " + podatek);
        }
        else if (dochód>60000) {
            podatek = dochód * 0.48;
            System.out.println("Twój podatek to: " + podatek);
        }
        else if (dochód>31000) {
            podatek = dochód * 0.42;
            System.out.println("Twój podatek to: " + podatek);
        }
        else if (dochód>18000) {
            podatek = dochód * 0.35;
            System.out.println("Twój podatek to: " + podatek);
        }
        else if (dochód>11000) {
            podatek = dochód * 0.25;
            System.out.println("Twój podatek to: " + podatek);
        }
        else {
            System.out.println("Nie płacisz podatku!");
        }
    }
}
