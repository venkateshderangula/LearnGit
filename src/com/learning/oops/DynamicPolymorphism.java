package com.learning.oops;

public class DynamicPolymorphism {
    public static void main(String[] a) {


        Student1 s1 = new Student1("karan", 2);
        System.out.println(s1.getDetails());
        System.out.println(s1.computeFees());
        Student1 s2 = new ResearchStudent4("siddharth", 3, "Software Engineering");
        System.out.println(s2.getDetails());
        System.out.println(s2.computeFees(1000));

        s2 =  new ResearchStudent4("venky", 4, "software student");
        System.out.println(s2.getDetails());


    }
}


class Student1 {
    protected final String name;
    protected int year;

    private static final int annualFees = 10000;

    public Student1(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public float computeFees () {
        return Student1.annualFees * year;
    }
    public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudent4 extends Student1 {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent4(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;

    }

    @java.lang.Override
    public String getDetails() {
        return this.name + " is a research student with research area " + this.researchArea + " and he/she is in his/her year " + this.year;
    }
}






