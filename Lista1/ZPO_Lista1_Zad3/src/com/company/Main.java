package com.company;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sentence");
        String zdanie = scanner.nextLine();

        latin(zdanie);

    }

    private static void latin(String zdanie) {


        String latin = zdanie.replaceAll("[^a-zA-Z ]", ""); // tylko litery angielskeigo alfabetu
        String words[] = latin.split(" ");

        for (String word : words) {
            Character letter = word.charAt(0);
            if (Character.isUpperCase(letter)) {
                System.out.print(word + " ");
                continue;
            }
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
                System.out.print(word + "way ");
            } else {
                System.out.print(word.substring(1, word.length()) + "ay ");
            }
        }


    }


}
