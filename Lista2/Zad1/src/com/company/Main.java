package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //D:\zpo\lab_2\ATP_ranking_7_10_2019_top50.txt

        List pozycja = new ArrayList();
        List kraj = new ArrayList<String>();
        List in = new ArrayList<String>();
        List wiek = new ArrayList<String>();
        List punkty = new ArrayList<String>();
        List mecze = new ArrayList<String>();

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
                pozycja.add(Integer.valueOf(elements[0]));
                kraj.add(elements[1]);
                in.add(elements[2]);
                wiek.add(Integer.valueOf(elements[3]));
                punkty.add(Integer.valueOf(elements[4]));
                mecze.add(Integer.valueOf(elements[5]));
            }
            bufferedReader.close();
            fileReader.close(); //można zamknąc tu lub w finally
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(numerPozycji(in, pozycja));
        System.out.println(iluZKtaju(kraj));
        System.out.println(Arrays.deepToString( sriOd(wiek)));
        System.out.println(roznica(punkty, 45, 1));
        zapis(mecze);
    }

    public static int numerPozycji(List in, List pozycja){
        int numerPozycji=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Wpisz nazwisko");
        String nazwisko = sc.nextLine();
        String ina = new String();
        for(int i=0; i<in.size(); i++){
            ina= String.valueOf(in.get(i));
            if(ina.contains(nazwisko)){
                numerPozycji= Integer.parseInt(String.valueOf(pozycja.get(i)));
            }
        }
        return numerPozycji;
    }



    public static int iluZKtaju(List kraj){
        int iluZKtaju=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Wpisz kod kraju");
        String krajgracza = sc.nextLine();
        for(int i=0; i<kraj.size(); i++){
            if (krajgracza.equalsIgnoreCase(String.valueOf(kraj.get(i)))){
                iluZKtaju++;
            }
        }
        return iluZKtaju;
    }


    public static double[][] sriOd(List wiek){
        double[][] sriOd = new double[1][2];
        double suma=0;
        double srednia=0;
        double odchylenie=0;
        for(int i=0; i<10; i++){
                suma+=Integer.valueOf((Integer) wiek.get(i));
                srednia=(suma/i);
                odchylenie=Math.pow(Integer.valueOf((Integer) wiek.get(i))-srednia, 2);
        }
        sriOd[0][0]=srednia;
        sriOd[0][1]=Math.sqrt(odchylenie/9);
        return sriOd;
    }


    public static double roznica (List punkty, int pierwszy, int drugi){
        double roznica=0;
        double punktyPierwszy=0;
        double punktyDrugi=0;
        for (int i=0; i<punkty.size(); i++){
         if (pierwszy==i){
             punktyPierwszy=Integer.valueOf((Integer) punkty.get(i-1));
         }
         if(drugi==i){
             punktyDrugi=Integer.valueOf((Integer) punkty.get(i-1));
         }
        }
        roznica=punktyPierwszy-punktyDrugi;
        return roznica;
    }

    public static void zapis(List mecze){

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("histogram.txt"));

        for(int i=0; i<mecze.size(); i++) {
            bw.append((String.valueOf(mecze.get(i))));
            bw.newLine();
        }
        bw.close();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
