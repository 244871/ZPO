package com.company;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double houlyWage;
    private int workingHoursAWeek;

    public double getHoulyWage() { return houlyWage; }
    public void setHoulyWage(double houlyWage) { this.houlyWage = houlyWage; }
    public int getWorkingHoursAWeek() { return workingHoursAWeek; }
    public void setWorkingHoursAWeek(int workingHoursAWeek) { this.workingHoursAWeek = workingHoursAWeek; }

    public HourlyEmployee(String name, String surname, LocalDate employmentDate, int IDNumber, double houlyWage, int workingHoursAWeek) {
        super(name, surname, employmentDate, IDNumber);
        this.houlyWage = houlyWage;
        this.workingHoursAWeek = workingHoursAWeek;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "houlyWage=" + houlyWage +
                ", workingHoursAWeek=" + workingHoursAWeek +
                '}';
    }

    public double salary(double houlyWage, int workingHoursAWeek){
        double salary=0;
        if (houlyWage<0)
            System.out.println("Stawka godzinowa poniżej 0!");
        if ((workingHoursAWeek<0))
            System.out.println("Przepracowano mniej niż 0 godzin");
        if (workingHoursAWeek>168)
            System.out.println("Przepracowano ponad 168 godzin");
        if (workingHoursAWeek<=40)
        salary=workingHoursAWeek*houlyWage;
        else {
            salary=(40*houlyWage)+((workingHoursAWeek-40)*(houlyWage*1.1));
        }
        return salary;
    }

}
