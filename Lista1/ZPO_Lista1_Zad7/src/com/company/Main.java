package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	System.out.println(Arrays.deepToString(a()));
    System.out.println(Arrays.deepToString(b()));
    System.out.println(Arrays.deepToString(c()));
    }

    public static int[][] a(){
        int[][] a=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i+1) == j) {
                    a[i][j] = 1;
                }
            }
        }
        return a;
    }
    public static int[][] b(){
        int[][] b=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((j) == 1) {
                    b[i][j] = 1;
                }
            }
        }
        return b;
    }
    public static int[][] c(){
        int[][] c=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j+i == 3) {
                    c[i][j] = 1;
                }
            }
        }
        return c;
    }
}
