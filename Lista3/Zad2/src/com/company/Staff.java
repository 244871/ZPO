package com.company;

import java.util.ArrayList;

public class Staff {
    private ArrayList<Employee> staff = new ArrayList<Employee>();

    public void addStaff(Employee employee){
        staff.add(employee);
    }

    public void removeStaff(int ID){
        for(Employee employee: staff){
            if(employee.getIDNumber() == ID){
                staff.remove(staff.indexOf(employee));
            }
        }
    }

    public ArrayList<Employee> getPersonel() {
        return staff;
    }
}
