package com.Mindtree.MindTree;

public class Employee_Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.empName="Soumojit Mandal";
        emp1.empId= 2805;
        emp1.empSalary= 1000000;
        emp1.displayEmployeeBonus();

        emp2.empName="Debali Das";
        emp2.empId=2910;
        emp2.empSalary=999999;
        emp2.displayEmployeeBonus();
    }
}
