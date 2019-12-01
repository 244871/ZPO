package com.company;

import java.time.LocalDate;

public class BasePlusComissionEmployee extends Employee {
    private double provisionPercent;
    private double salesValue;
    private double baseSalary;

    public double getProvisionPercent() { return provisionPercent; }
    public void setProvisionPercent(double provisionPercent) { this.provisionPercent = provisionPercent; }
    public double getSalesValue() { return salesValue; }
    public void setSalesValue(double salesValue) { this.salesValue = salesValue; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public BasePlusComissionEmployee(String name, String surname, LocalDate employmentDate, int IDNumber, double provisionPercent, double salesValue, double baseSalary) {
        super(name, surname, employmentDate, IDNumber);
        this.provisionPercent = provisionPercent;
        this.salesValue = salesValue;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusComissionEmployee{" +
                "provisionPercent=" + provisionPercent +
                ", salesValue=" + salesValue +
                ", baseSalary=" + baseSalary +
                '}';
    }
    public double basePlusComissionEmployeeSalary(double provisionPercent, double salesValue){
        double basePlusComissionEmployeeSalary=0;
        if (salesValue<0)
            System.out.println("Wartość sprzedaży mniejsza niż 0");
        if (provisionPercent<0){
            System.out.println("Niepoprawny procent prowizji");
        }
        if (provisionPercent>1)
            System.out.println("Niepoprawny procent prowizji");
        else
            basePlusComissionEmployeeSalary = provisionPercent*salesValue;
        return basePlusComissionEmployeeSalary;
    }

}
