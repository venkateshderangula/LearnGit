package com.learning.oops;
import java.util.*;





class SavingAmount {

    private int saving;

    public void setInitialSaving(int saving) {

        this.saving =  saving;
    }

    public void incrementSaving() {

        this.saving += 1000;
    }

    public void checkSaving() {
        if(this.saving >= 1000)
            System.out.println("Congratulations! You have saved a good amount");
        else if (this.saving > 0 && this.saving < 1000 ) {
            System.out.println("Insufficient saving!");
        }
        else
            System.out.println("You are in debt");
    }

    public void decrementSaving() {
        this.saving -= 100;
    }

    public int getCurrentSaving() {
        return  this.saving;
    }
//write your code here
}

public class SavingsAccount {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs" + obj.getCurrentSaving());
    }
}