package com.learning.basics;

public class MinutesToYearsAndDays {

    public static final String INVALID_INPUT_VALUE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(1440);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0)
            System.out.println(INVALID_INPUT_VALUE);

        int days = (int) minutes / (24 * 60);
        int years = days / 365;
        int remainingDays = 0;
        if (days > 365) {
            remainingDays = years % days;
        } else
            remainingDays = days;


        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");


    }
}
