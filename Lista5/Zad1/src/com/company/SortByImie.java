package com.company;

import java.util.Comparator;

public class SortByImie implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getImie().compareTo(o2.getImie());
    }
}
