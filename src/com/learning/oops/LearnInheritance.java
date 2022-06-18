package com.learning.oops;

public class LearnInheritance {

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.id);



    }

}

class Parent{

    String name;
    int id;

    public Parent() {
        System.out.println("inside parent constructor");
    }
}

class Child extends Parent{

    String hobby;

    public Child() {
        System.out.println("inside child constructor");
        super.id = 758890;
        //this.test = "test_name";

    }
}

