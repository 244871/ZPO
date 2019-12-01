package com.company;

public class BasePlusComissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double  commissionRate;
    private double baseSalary;

    @Override
    public double earnings() {
        return baseSalary + grossSales*commissionRate;
    }

    public BasePlusComissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }
}
