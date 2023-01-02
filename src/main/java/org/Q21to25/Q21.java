package org.Q21to25;

public class Q21 {
    /**21- Given three int values, a b c, return the largest.

     intMax(1, 2, 3) → 3
     intMax(1, 3, 2) → 3
     intMax(3, 2, 1) → 3*/

    public int intMax(int a,int b, int c){
        if(a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else return c;
    }

    public static void main(String[] args) {
        Q21 q21 = new Q21();
        System.out.println(q21.intMax(20, 3, 70));
    }
}
