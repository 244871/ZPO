package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(rzuty(1)));
        probability(10);
    }

    public static int[] rzuty(int n) {
        int[] rzuty = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            rzuty[i] = (1 + r.nextInt(6));
        }
        return rzuty;
    }

    private static void probability(int n) {
        double[] probability = new double[6];
        int[] rzuty = rzuty(n);
        System.out.println(Arrays.toString(rzuty));
        int[] counter = new int[6];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                if (rzuty[i] == j + 1) {
                    counter[j] = counter[j]+1;
                }
            }
        }
        System.out.println(Arrays.toString(counter));

        for (int i = 0; i < 6; i++) {
            probability[i] = (double) counter[i] / n;
        }
        System.out.println(Arrays.toString(probability));


    }
}


