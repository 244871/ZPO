package com.company;

public class Tenisista implements Comparable{
    private int pozycja;
    private String kraj;
    private String imie;
    private String nazwisko;
    private int wiek;
    private int punkty;
    private int mecze;

    public Tenisista(int pozycja, String kraj, String imie, String nazwisko, int wiek, int punkty, int mecze) {
        this.pozycja = pozycja;
        this.kraj = kraj;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.punkty = punkty;
        this.mecze = mecze;
    }

    public int getPozycja() {
        return pozycja;
    }

    public void setPozycja(int pozycja) {
        this.pozycja = pozycja;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public int getMecze() {
        return mecze;
    }

    public void setMecze(int mecze) {
        this.mecze = mecze;
    }

    @Override
    public String toString() {
        return "\n" +
                "pozycja=" + pozycja +
                ", kraj='" + kraj + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", punkty=" + punkty +
                ", mecze=" + mecze +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
