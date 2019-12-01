package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kulturysta implements Measurable {
    private String name;
    private Sex sex;
    private double weight;
    private double hight;
    private LocalDate dateOfBirth;

    public Kulturysta(String name, Sex sex, double weight, double hight, LocalDate dateOfBirth) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.hight = hight;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public int age(){
        return LocalDate.now().getYear()-dateOfBirth.getYear();
    }


    @Override
    public String toString() {
        return "Kulturysta{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", weight=" + weight +
                ", hight=" + hight +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public double getMeasure() {

        if(sex.equals(Sex.female)){
            return 655.1 + (9.563*weight) + (1.85*hight) - (4.676*age());
        }
        else {
            return  66.5 + (13.75*weight) + (5.003*hight) - (6.775*age());
        }
    }
}
