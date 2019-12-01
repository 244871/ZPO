package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {



        ArrayList<Tenisista> tenisistas = new ArrayList<Tenisista>();
        FileReader fileReader = null; //czyta znak po znaku
        String sciezka = ("C:\\Users\\agnie\\Desktop\\tenis.txt");

        File file = new File(sciezka);

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;

        try {
            while ((line = bufferedReader.readLine()) != null) {

                String[] elements = line.split("\t");
                String[] imienazwisko = elements[2].split(" ");
                tenisistas.add(new Tenisista(Integer.valueOf(elements[0]),elements[1],imienazwisko[0], imienazwisko[1],Integer.valueOf(elements[3]),Integer.valueOf(elements[4]),Integer.valueOf(elements[5])));
            }
            bufferedReader.close();
            fileReader.close(); //można zamknąc tu lub w finally
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(tenisistas.toString());
        System.out.println();
        System.out.println("\n" +"Sortowanie przez imię");
        Collections.sort(tenisistas, new SortByImie());
        System.out.println(tenisistas.toString());
        System.out.println("\n" +"Sortowanie przez pozycję");
        Collections.sort(tenisistas, new SortByPozycja());
        System.out.println(tenisistas.toString());
        System.out.println("\n" +"Sortowanie przez nazwisko");
        Collections.sort(tenisistas, new SortByNazwisko());
        System.out.println(tenisistas.toString());
        System.out.println("\n" +"Sortowanie przez ilość punktów");
        Collections.sort(tenisistas, new SortByPunkty());
        System.out.println(tenisistas.toString());
        System.out.println("\n" +"Sortowanie przez kraj");
        Collections.sort(tenisistas, new SortByKraj());
        System.out.println(tenisistas.toString());
        System.out.println("\n" +"Sortowanie przez ilość meczy");
        Collections.sort(tenisistas, new SortByMecze());
        System.out.println(tenisistas.toString());
        System.out.println("\n" +"Sortowanie przez wiek");
        Collections.sort(tenisistas, new SortByWiek());
        System.out.println(tenisistas.toString());

    }

}
