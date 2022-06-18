package com.learning.oops.practice.additional;

public class Question1 {
    public static void main(String[] args) {

        //Write your code here

        Employee e1 = new Employee(101512031,
                "Sushil",
                "Kumar",
                45000.58);
        Employee e2 = new Employee(101512032,
                "Tara",
                "Sharma",
                51000.99);
        e1.displayDetails();
        e2.displayDetails();
    }
}



class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    //Write your code here

    public Employee(int empId, String empFirstName, String empSecondName, double empSalary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;
        this.empSalary = empSalary;
    }

    public void displayDetails() {
        System.out.println("employee full name" + this.empFirstName + ' ' + this.empSecondName);
        System.out.println("employee annual package " + this.empSalary);

    }
}


