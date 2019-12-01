package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = sc.nextLine();
        System.out.println("Podaj płeć: ");
        String plec = sc.nextLine();
        System.out.println("Podaj date urodzenia (rrrr-mm-dd): ");
        String data = sc.nextLine();
        System.out.println("Podaj wzrost w cm: ");
        String wzrost = sc.nextLine();
        System.out.println("Podaj wagę w kg: ");
        String masa = sc.nextLine();
        sc.close();

        LocalDate dt = LocalDate.parse(data);

        HealthProfile healthProfile = new HealthProfile(imie, nazwisko,plec,dt,Integer.valueOf(wzrost),Integer.valueOf(masa));

        System.out.println(healthProfile.getImie()+" "+healthProfile.getNazwisko());
        System.out.println(healthProfile.getPlec());
        System.out.println(healthProfile.getUrodziny());
        System.out.println("waga "+healthProfile.getMasa()+ "kg");
        System.out.println("wzrost "+healthProfile.getWzrost()+"cm");
        System.out.println("wiek "+ healthProfile.wiek()+"lat");
        System.out.println("BMI = "+healthProfile.bmi());
        System.out.println("maksymalne tętno: "+healthProfile.max());
        System.out.println("docelowe tętno: od "+healthProfile.minimalne()+" do "+healthProfile.maksymalne());

    }
}
