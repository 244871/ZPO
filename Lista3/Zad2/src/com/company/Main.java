package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Staff staff=new Staff();
        Employee employee1=new Employee("Marcin", "Grzeszkow", LocalDate.of(2002, 01,02), 12);
        HourlyEmployee hourlyEmployee1=new HourlyEmployee("Józef", "Nowicki", LocalDate.of(2014,02,01), 45, 12.5, 51 );
        SalariedEmployee salariedEmployee1=new SalariedEmployee("Joanna", "Marciniak", LocalDate.of(2012, 05,01), 68, 12545);
        ComissionEmployee comissionEmployee1=new ComissionEmployee("Zuzanna", "Wróbel", LocalDate.of(2005,12,10), 95, 0.75, 45212);
        BasePlusComissionEmployee basePlusComissionEmployee1=new BasePlusComissionEmployee("Marcin", "Sporek", LocalDate.of(2014,06,01), 103, 0.80, 14521, 12345);


        staff.addStaff(employee1);
        staff.addStaff(hourlyEmployee1);
        staff.addStaff(comissionEmployee1);
        staff.addStaff(salariedEmployee1);
        staff.addStaff(basePlusComissionEmployee1);

        for (Employee employee:staff.getPersonel()){
            employee1.toString();
            System.out.println(employee.getName()+" "+employee.getSurname()+" : ");
            System.out.println("Czas pracy: "+employee.duration(employee.getEmploymentDate())+ " lat");
            if(employee instanceof SalariedEmployee){
                System.out.println("Tygodniowy zarobek: "+((SalariedEmployee) employee).weekSalary(((SalariedEmployee) employee).getSalary()));

            }

            System.out.println("________________");
        }
    }
}
