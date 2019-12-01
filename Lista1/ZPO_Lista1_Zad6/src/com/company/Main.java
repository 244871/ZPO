package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(shadow(10));
    }


    private static double shadow (int n){
        double shadow=0;
        int[][] matrix = new int[n][n];
        Random r = new Random();
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                matrix[i][j] = (-10 + r.nextInt(16));
            }
        }
        for (int i=0; i<n; i++){
            shadow += matrix[i][i];
        }

        System.out.println(Arrays.deepToString(matrix));
        return shadow;
    }
}
