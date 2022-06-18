package com.learning.oops;

import java.util.*;

public class CardsGame {
    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}


class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.



    int getSuitPriority(String suitString) {


        int spades =4 ;
        int diamond =3;
        int hearts =2;
        int clubs =1;



        if(suitString.equalsIgnoreCase("spades") ){
            return spades;
        }else if (suitString.equalsIgnoreCase("diamonds")){
            return  diamond;
        } else if (suitString.equalsIgnoreCase("hearts")) {
            return  hearts;

        } else if (suitString.equalsIgnoreCase("clubs")) {
            return  clubs;
        }
        else{

            System.out.println(this.suit + " is Invalid suit");
        }
        return -1;

    }


}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.
        if (c1.value == c2.value) {

            int c1_priority = c1.getSuitPriority(c1.suit);
            int c2_priority = c2.getSuitPriority(c2.suit);

            if(c1_priority == -1 || c2_priority == -1){
                System.out.println("Invalid suit found, try again");
                return;
            }

            if( c1_priority > c2_priority){
                points1++;
            }else if(c1_priority < c2_priority){
                points2++;
            }
        } else if (c1.value > c2.value)
            points1++;
        else
            points2++;


        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}

