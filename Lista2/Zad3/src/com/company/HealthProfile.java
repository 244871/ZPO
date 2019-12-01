package com.company;

import java.time.LocalDate;


/**
 * @author Agnieszka Stasiak
 * @version 1
 */
public class HealthProfile {


    private String imie;
    private String nazwisko;
    private String plec;
    private LocalDate urodziny;
    private int wzrost;
    private int masa;


    public HealthProfile(String imie, String nazwisko, String plec, LocalDate urodziny, int wzrost, int masa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.urodziny = urodziny;
        this.wzrost = wzrost;
        this.masa = masa;
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getPlec() {
        return plec;
    }
    public void setPlec(String plec) {
        this.plec = plec;
    }
    public LocalDate getUrodziny() {
        return urodziny;
    }
    public void setUrodziny(LocalDate urodziny) {
        this.urodziny = urodziny;
    }
    public int getWzrost() {
        return wzrost;
    }
    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }
    public int getMasa() {
        return masa;
    }
    public void setMasa(int masa) {
        this.masa = masa;
    }


    public int wiek(){

        int wiek = LocalDate.now().getYear() - urodziny.getYear();
        return wiek;
    }

    public int max(){
        int max = 220 - wiek();
        return max;
    }

    public double minimalne(){

        double minimalne = 0.5*max();
        return minimalne;
    }

    public double maksymalne(){
        double maksymalne = 0.7*max();
        return maksymalne;
    }

    public double bmi(){
        double bmi = masa/Math.pow((double)wzrost/100,2);
        return bmi;
    }
}
