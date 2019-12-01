package com.company;

import java.util.Comparator;

public class SortByPozycja implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getPozycja()-o2.getPozycja();
    }
}
