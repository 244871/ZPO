package com.company;

import java.util.Comparator;

public class SortByMecze implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getMecze()-o2.getMecze();
    }
}
