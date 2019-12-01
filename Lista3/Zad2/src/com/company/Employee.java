package com.company;

import java.time.LocalDate;


public class Employee {
    private String name;
    private String surname;
    private LocalDate employmentDate;
    private int IDNumber;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public LocalDate getEmploymentDate() { return employmentDate; }
    public void setEmploymentDate(LocalDate employmentDate) { this.employmentDate = employmentDate; }
    public int getIDNumber() { return IDNumber; }
    public void setIDNumber(int IDNumber) { this.IDNumber = IDNumber; }


    public Employee(String name, String surname, LocalDate employmentDate, int IDNumber) {
        this.name = name;
        this.surname = surname;
        this.employmentDate = employmentDate;
        this.IDNumber = IDNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employmentDate=" + employmentDate +
                ", IDNumber=" + IDNumber +
                '}';
    }

    public int duration (LocalDate employmentDate){
        return (LocalDate.now().getYear()-employmentDate.getYear());
    }
}
