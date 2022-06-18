package com.learning.chapter.three.module.one;

public class ArraysNAlist {
    public static void main(String[] args) {
        int a[], b;
        int[]  c, d;
        a = new int[3];
        c = new int[2];
        d = new int[2];
        Object arr[] = {1,2,4,"venky"};
        System.out.println(arr[3]);
        Object[] arr1 = new Object[]{1,2,"teddy", 3.3,
                new Integer(4) /*this is redundant, simple use 4*/,
                new String("venkatesh") /*new string is redundant*/
        };


    }
}
