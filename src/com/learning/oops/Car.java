package com.learning.oops;

public class Car {
    public static void main(String[] args) {
        Bus b = new Bus();

        Bus.move();
        System.out.println(Bus.brand);
    }


}

class Bus{
    public static String brand =  "volvo";

    public static void move(){
        System.out.println("bus is moving");
    }
}
