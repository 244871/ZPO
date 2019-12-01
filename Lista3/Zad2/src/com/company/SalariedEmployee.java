package com.company;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public SalariedEmployee(String name, String surname, LocalDate employmentDate, int IDNumber, double salary) {
        super(name, surname, employmentDate, IDNumber);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                '}';
    }

    public double weekSalary(double salary){
        double weekSalary=0;
        if ((salary*12/52)<0)
            System.out.println("Wynagrodzenie mniejsze od 0");
        else {
            weekSalary=salary*12/52;
        }
        return salary;
    }
}
