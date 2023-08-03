package com.Mindtree;

public class Employee {
    String empName="ABAc ";
    int empId = 100;
    int empSalary = 1000;

    public void displayEmployeeBonus(){
        System.out.println("Employee "+empName+" of ID:"+empId+" gets a salary of:"+empSalary+" and a bonus of:"+(empSalary*0.20));
    }
}
