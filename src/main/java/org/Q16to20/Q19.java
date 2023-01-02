package org.Q16to20;

public class Q19 {
    /**19- Given 2 int values, return true if either of them is in the range 10..20 inclusive.

     in1020(12, 99) → true
     in1020(21, 12) → true
     in1020(8, 99) → false*/


    boolean in1020 (int a, int b){
        return ((a>=10 && a<=20) || (b>=10 && b<=20));
    }

    public static void main(String[] args) {
        Q19 q19 = new Q19();
        System.out.println(q19.in1020(8,99));
    }
}
