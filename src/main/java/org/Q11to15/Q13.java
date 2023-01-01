package org.Q11to15;

public class Q13 {
    /**13- Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

     makes10(9, 10) → true
     makes10(9, 9) → false
     makes10(1, 9) → true*/

    boolean sumNumb (int a, int b){
        int res=a+b;
        if (a==10 || b==10 || res==10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Q13 n1 = new Q13();
        System.out.println(n1.sumNumb(9, 10));
    }

}
