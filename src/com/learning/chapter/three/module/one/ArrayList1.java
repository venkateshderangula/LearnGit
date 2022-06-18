package com.learning.chapter.three.module.one;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {




        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            int n = s.nextInt();
            for (int i = 0; i < n; i++)
                list.add(s.nextInt());
            reverseArrayList(list);
            for (int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + " ");
        }

        // Method to reverse the ArrayList
        static void reverseArrayList(ArrayList<Integer> list) {
            // Write your code here


            for(int i = 0 ; i < list.size() /2; i++){

                int temp = list.get(i);

                list.set(i, list.get(list.size() -1 - i));
                list.set(list.size() -1 -i, temp);

            }



        }
    }

