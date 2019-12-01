package com.company;

public class ComissionCompensationModel extends CompensationModel{
    private double grossSales;
    private double  commissionRate;

    @Override
    public double earnings() {
        return grossSales*commissionRate;
    }

    public ComissionCompensationModel(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
}
