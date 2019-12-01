package com.company;

import java.util.Comparator;

public class SortByKraj implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getKraj().compareTo(o2.getKraj());
    }
}
