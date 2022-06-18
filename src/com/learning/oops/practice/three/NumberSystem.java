package com.learning.oops.practice.three;
import java.util.*;



public class NumberSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}




class Number {
    //Write your code here

    private double real;
    private double img;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }


    public Number(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getImaginaryPart() {
        //Write your code here

        return getImg();
    }

}

class Complex extends Number {
    public Complex(double real, double img) {
        super(real, img);
    }
//Write your code here

    public void checkComplex(){

         if(this.getImaginaryPart() != 0d){
             System.out.println("The given number is complex");

         }
         else
             System.out.println("The given number is real");


    }
}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double nextDouble, double nextDouble1) {
        super(nextDouble,nextDouble1);

    }

//Write your code here

    public void checkPurelyImaginaryNumber(){
           if( this.getReal() == 0d && this.getImaginaryPart() != 0d ){
               System.out.println("+i" + this.getImaginaryPart());
               System.out.println("The number is purely imaginary");

           }
           else {
               System.out.println(this.getReal() + "+i" + this.getImaginaryPart());
               System.out.println("The number is not purely imaginary");
           }

    }
}



