package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year;
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rok");
        year = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj miesiąc");
        month = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println(date);

        card(date);
    }

    public static void card(LocalDate date) {
        DayOfWeek day;
        day = date.getDayOfWeek();

        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Sat", "Sun"};
        System.out.println(Arrays.toString(daysOfWeek));

        int daynumber = day.getValue();

        int[][] card = new int[((date.lengthOfMonth()+daynumber+5)/7)][7];
        for (int i = 0; i < ((date.lengthOfMonth()+daynumber+5)/7); i++) {
            for (int j = 0; j < 7; j++) {
                if ((7 * i + j + 2) - daynumber > date.lengthOfMonth()) {
                    break;
                } else if (7 * i + j + 1 < daynumber) {
                    continue;
                } else {
                    card[i][j] = (7 * i + j + 2) - daynumber;
                }
            }
        }
        for (int i = 0; i <((date.lengthOfMonth()+daynumber+5)/7); i++) {
            System.out.println(Arrays.toString(card[i]));

        }
    }
}

