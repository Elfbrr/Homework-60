package org.Q16to20;

public class Q17 {
    /**17- Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
     * Use the % "mod" operator

     or35(3) → true
     or35(10) → true
     or35(8) → false*/
    boolean nonNeg(int a){
        return (a>0 && a%3==0 || a%5==0);

    }
    public static void main(String[] args) {
        Q17 q17 = new Q17();
        System.out.println(q17.nonNeg(12));
    }

}
