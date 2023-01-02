package org.Q21to25;

public class Q22 {
    /**22- Given 2 int values, return whichever value is nearest to the value 10,
     * or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

     close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0*/

    public int close10(int a,int b){
        int close = Math.abs(10-a);
        int close1= Math.abs(10-b);
        if (close<close1)
            return a;
        else if (close1<close)
                return b;
        else
            return 0;
    }

    public static void main(String[] args) {
        Q22 q22 = new Q22();
        System.out.println(q22.close10(13, 8));
    }
}
