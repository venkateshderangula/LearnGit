package com.learning.oops;

public class DPAdv1 {
    public static void main(String[] a) {

        Student3 s1 = new Student3("karan", 3);
        System.out.println(s1.getDetails());

        ResearchStudent3 s2 = new ResearchStudent3("siddharth", 3, "Software Engineering");
        System.out.println(s2.getDetails());


    }

}
class Student3 {
    protected final String name;
    protected int year;

    protected static final int annualFees = 10000;

    public Student3(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public String getDetails() {
        return "Name : " + name + '\n' +
                "Fees : " + computeFees();
    }

    protected float computeFees() {
        return Student3.annualFees * year;
    }

    public float computeFees(int annualFees){
        return annualFees * this.year;
    }

}

class ResearchStudent3 extends Student3 {
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent3(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    protected float computeFees(){
        return Student3.annualFees * this.year*0.9f;
    }


}



