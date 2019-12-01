package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz hasło do złamania");
        String haslo = scanner.nextLine();

        System.out.println(Lamany(haslo));
    }

    static String Lamany(String haslo) { // tworzę metodę
        //int długość = hasło.length();
        StringBuilder sb = new StringBuilder();

        haslo = haslo.toUpperCase();
        char[] znaki = haslo.toCharArray();

        for (char znak : znaki) {
            for (char c = 'A'; c <= 'Z'; c++) {
                if (znak == c) {
                    sb.append(znak);
                }
            }
        }
        return sb.toString();
    }
}
