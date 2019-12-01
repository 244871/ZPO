package com.company;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Measurable> measurable = new ArrayList<>();
        measurable.add(new Kulturysta("Marcin", Sex.male, 99., 176, LocalDate.of(2004, 3, 19)));
        measurable.add(new Kulturysta("Marek", Sex.male, 86, 153, LocalDate.of(1998, 8, 24)));
        measurable.add(new Kulturysta("Ela", Sex.female, 60, 173, LocalDate.of(2000, 5, 6)));
        measurable.add(new Kulturysta("Ala", Sex.female, 49, 163, LocalDate.of(1994, 4, 16)));

        Measurable largeKulturysta = largest(measurable);

        Kulturysta kulturysta = (Kulturysta) largeKulturysta;
        System.out.println(kulturysta.getName());

    }

    public static Measurable largest(ArrayList<Measurable> measurables) {

        Measurable measurable = null;
        double temp = 0;
        for (Measurable kulturysta : measurables) {
            if (kulturysta.getMeasure() > temp) {
                temp = kulturysta.getMeasure();
                measurable = kulturysta;
            }
        }
        return measurable;
    }
}

