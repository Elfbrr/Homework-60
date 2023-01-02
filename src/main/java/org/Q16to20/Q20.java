package org.Q16to20;

public class Q20 {
    /**
     * 20- We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1 or more of them are teen.
     * <p>
     * hasTeen(13, 20, 10) → true
     * hasTeen(20, 19, 10) → true
     * hasTeen(20, 10, 13) → true
     */

    boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public static void main(String[] args) {
        Q20 q20 = new Q20();
        System.out.println(q20.hasTeen(12, 19, 10));
    }
}