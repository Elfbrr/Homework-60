package org.Q11to20;

import java.util.Scanner;

public class Q11 {

    /**11- Given two int values, return their sum. Unless the two values are the same, then return double their sum.

     sumDouble(1, 2) → 3
     sumDouble(3, 2) → 5
     sumDouble(2, 2) → 8*/
    public static int sumDouble(int a, int b){
        int result = a+b;
        if (a==b)
            return 2*(result);
        else
            return result;
    }

    public static void main(String[] args) {
        Q11 question = new Q11();
        System.out.println(question.sumDouble(5, 5));


    }
}
