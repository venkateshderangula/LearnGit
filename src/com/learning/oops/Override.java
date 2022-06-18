package com.learning.oops;

public class Override {

    public static void main(String[] args) {
        Square1 s = new Square1(4);
        s.area();
        s.perimeter();
    }
}

class Rectangle1 {
    private double width;
    private double height;

    Rectangle1(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void test(){
        System.out.println("hello test");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void area() {
        System.out.println("Area of Rectangle is: " +  (width * height) ) ;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + ( (2* width) +
                (2* height) ) ) ;
    }
}

class Square1 extends Rectangle1 {


    public Square1(double side){
        super(side, side);
    }

    public void area() {

        System.out.println("Area of Square is: " +  2  * super.getWidth());

    }


    public void perimeter() {
        System.out.println("Perimeter of Square is: " + 4 * super.getWidth() );

    }
}

class Square2 extends  Square1{


    public Square2(double side) {
        super(side);
    }


    public void test() {
        System.out.println("testing hellow");
    }
}

