package com.learning.oops;

public class MultipleInheritanceSuper {
    public static void main(String[] args) {
        Square sq = new Square();
    }
}

class Shape {
    public Shape() {
        super();
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        super();
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square extends Rectangle {
    public Square() {
        super();
        System.out.println("inside Square class default constructor");
    }
}


