package org.Q6to10;

public class Q9 {

    /**
     * 9- The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * <p>
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    boolean sleepIn(boolean weekday,boolean vacation){

        if(weekday &!vacation)return false;
        else return true;
    }

    public static void main(String[] args) {
        Q9 question = new Q9();
        System.out.println(question.sleepIn(true, false));

    }

}
