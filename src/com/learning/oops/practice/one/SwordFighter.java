package com.learning.oops.practice.one;

public interface SwordFighter {

     /*
    An interface named SwordFighter. The interface should contain the following variable and methods:
    An int variable maxSwordsWielded, which should be set to 2
    An abstract void method escape()
    An abstract void method showWeapon()
    An abstract void method attack()
     */


    int maxSwordsWielded = 2;
    void escape();
    void showWeapon();
    void attack();
}
