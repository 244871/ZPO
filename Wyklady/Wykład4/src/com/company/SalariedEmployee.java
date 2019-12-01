package com.company;

public class SalariedEmployee extends Employee {
    private double salary;


    @Override
    public double earings() {

        return salary;
    }

    public SalariedEmployee(String name, String lastname, String ssn, double salary) {
        super(name, lastname, ssn);
        this.salary=salary
    }


    @Override
    public String toString() {

        return (super.toString()+"SalariedEmployee{" +
                "salary=" + salary +
                '}');
    }

    //Metody abstrakcyjne i interfejs - naucz się
}
