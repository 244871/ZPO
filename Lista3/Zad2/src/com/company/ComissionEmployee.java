package com.company;

import java.time.LocalDate;

public class ComissionEmployee extends Employee{
    private double provisionPercent;
    private double salesValue;

    public double getProvisionPercent() {
        return provisionPercent;
    }

    public void setProvisionPercent(double provisionPercent) {
        this.provisionPercent = provisionPercent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public ComissionEmployee(String name, String surname, LocalDate employmentDate, int IDNumber, double provisionPercent, double salesValue) {
        super(name, surname, employmentDate, IDNumber);
        this.provisionPercent = provisionPercent;
        this.salesValue = salesValue;
    }

    @Override
    public String toString() {
        return "ComissionEmployee{" +
                "provisionPercent=" + provisionPercent +
                ", salesValue=" + salesValue +
                '}';
    }

    public double comissionEmployeeSalary(double provisionPercent, double salesValue){
        double comissionEmpliyeeSalary=0;
        if (salesValue<0)
            System.out.println("Wartość sprzedaży mniejsza niż 0");
        if (provisionPercent<0){
            System.out.println("Niepoprawny procent prowizji");
        }
        if (provisionPercent>1)
            System.out.println("Niepoprawny procent prowizji");
        else
            comissionEmpliyeeSalary = provisionPercent*salesValue;
        return comissionEmpliyeeSalary;
    }
}
