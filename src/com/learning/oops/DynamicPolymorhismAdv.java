package com.learning.oops;

public class DynamicPolymorhismAdv {
    public static void main(String[] a) {

        Student2 s1 = new Student2("karan", 3);
//    System.out.println(s1.getDetails());

        ResearchStudent2 s2 = new ResearchStudent2("siddharth", 4, "Software Engineering");
//    System.out.println(s2.getDetails());

        PhDStudent s3 = new PhDStudent("hari", 1, "Software Engineering", "Automated Evaluation");
//    System.out.println(s3.getDetails());

        Student2[] array = {s1, s2, s3};
        printDetails(array);


    }

    public static void printDetails (Student2[] students)
    {for (Student2 student: students){
        System.out.println(student.getDetails());
    }
    }

}

class Student2 {
    protected final String name;
    protected int year;

    private static final int annualFees = 10000;

    public Student2(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public String getDetails() {
        return "Name : " + name + '\n' +
                "Fees : " + computeFees();
    }

    public int computeFees() {
        return Student2.annualFees * year;
    }
}

class ResearchStudent2 extends Student2 {
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent2(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return this.name + " is a research student with research area" + researchArea + " and he/she is in his/her year: " + year;
    }
}


class PhDStudent extends ResearchStudent2 {
    private String thesisTitle;
    private static final int annualFees = 10000;

    public PhDStudent(String name, int year, String researchArea, String thesisTitle) {
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;
    }

    public String getDetails() {
        return this.name + " is a PhD student with research area" + researchArea + " and he/she is in his/her year: " + year + ". He/She working on the thesis titled " + thesisTitle;
    }
}






