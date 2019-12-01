package com.company;

        import java.util.Comparator;

public class SortByWiek implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getWiek()-o2.getWiek();
    }



}
