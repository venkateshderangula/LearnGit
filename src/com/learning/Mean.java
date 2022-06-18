package com.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mean {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/hnt/Desktop/Masters/Java_Basics/FirstJavaProject/src/com/learning/quiz_numbers.txt");
        Scanner scan = new Scanner(file);
        int sum = 0;
        int count = 0;
        while(scan.hasNext()){
            count ++;
            sum = sum + scan.nextInt();


        }
        System.out.println(sum);
        System.out.println(count);
        float avg = sum / (float)count;

        System.out.println(avg);


    }
}
