package com.company;

import java.util.Comparator;

public class SortByNazwisko implements Comparator<Tenisista> {


    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getNazwisko().compareTo(o2.getNazwisko());
    }
}
