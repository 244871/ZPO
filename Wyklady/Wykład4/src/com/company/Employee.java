package com.company;

public abstract class Employee {
    private final String name;
    private final String lastname;
    private final String ssn;

    public Employee(String name, String lastname, String ssn) {
        this.name = name;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    public abstract double earings();



}
