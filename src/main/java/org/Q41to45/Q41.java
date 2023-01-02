package org.Q41to45;

import java.util.Arrays;

public class Q41 {
    /**41- Given an int array length 2, return true if it contains a 2 or a 3.

     has23([2, 5]) → true
     has23([4, 3]) → true
     has23([4, 5]) → false*/
    public boolean has23(int [] has1){
        if ((has1[0]==2 || has1[1]==3) || (has1[0]==3 || has1[1]==2))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Q41 q41=new Q41();
        int [] hasNew= {2,5};
        System.out.println(q41.has23(hasNew));
    }


     }
