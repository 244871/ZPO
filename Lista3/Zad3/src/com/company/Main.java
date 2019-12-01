package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Michał", "Małecki","6525753", new ComissionCompensationModel(145,85));
        Employee employee2 = new Employee("Monika", "Narcyz", "5672974", new BasePlusComissionCompensationModel(636,65,2435));

        System.out.println(employee1.earnings());
        System.out.println(employee2.earnings());

        employee1.setCompensationModel(new ComissionCompensationModel(164,73));

        System.out.println(employee1.earnings());
    }
}
