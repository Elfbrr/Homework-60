package org.Q11to15;

public class Q12 {
    /**12- We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     * Return true if we are in trouble.

     parrotTrouble(true, 6) → true
     parrotTrouble(true, 7) → false
     parrotTrouble(false, 6) → false*/

    boolean parrot(int hour,boolean talking){
        if (talking & (hour<7 || hour>20))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Q12 parrotTrouble = new Q12();
        System.out.println(parrotTrouble.parrot(7,true));
    }
}
