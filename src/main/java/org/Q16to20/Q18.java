package org.Q16to20;

public class Q18 {
    /**18- Given two temperatures, return true if one is less than 0 and the other is greater than 100.

     icyHot(120, -1) → true
     icyHot(-1, 120) → true
     icyHot(2, 120) → false*/
    boolean temp (int a, int b){
        return ((a<0 && b>100) || (a>100 && b<0));
    }

    public static void main(String[] args) {
        Q18 q18 = new Q18();
        System.out.println(q18.temp(-1,120));
    }
}
