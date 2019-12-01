package com.company;

import java.util.Comparator;

public class SortByPunkty implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getPunkty()-o2.getPunkty();
    }
}
