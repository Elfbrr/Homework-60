package org.Q21to25;

public class Q23 {
    /**
     * 23- Given 2 int values, return true if they are both in the range 30..40 inclusive,
     * or they are both in the range 40..50 inclusive.
     * <p>
     * in3050(30, 31) → true
     * in3050(30, 41) → false
     * in3050(40, 50) → true
     */
    boolean int3050(int a, int b) {
        return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b >= 50)));

    }

    public static void main(String[] args) {
        Q23 q23 = new Q23();
        System.out.println(q23.int3050(40, 50));
        System.out.println(q23.max1020(11, 19));
    }

    /**
     * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     * or return 0 if neither is in that range.
     * <p>
     * max1020(11, 19) → 19
     * max1020(19, 11) → 19
     * max1020(11, 9) → 11
     */

    public int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b <= 10 && b <= 20))
            return Math.max(a, b);
        else if (a >= 10 && a <= 20)
            return a;
        else if (b <= 10 && b <= 20)
        return b;
        else
        return 0;


    }
}
