package org.Q11to20;

public class Q14 {
    /**14-Given an int n, return true if it is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.

     nearHundred(93) → true
     nearHundred(90) → true
     nearHundred(89) → false*/

    boolean newNum (int n){
        if (Math.abs(n - 100) <= 10 ||Math.abs(n - 200) <= 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Q14 question = new Q14();
        System.out.println(question.newNum(77));
    }
}
