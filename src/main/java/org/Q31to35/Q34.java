package org.Q31to35;

public class Q34 {
    /**34-Given an array of ints length 3, return the sum of all the elements.

     sum3([1, 2, 3]) → 6
     sum3([5, 11, 2]) → 18
     sum3([7, 0, 0]) → 7*/

    public int sum3(int [] sum1){
        return sum1[0]+sum1[1]+sum1[2];
    }

    public static void main(String[] args) {
        Q34 q34= new Q34();
        int []sum1 = {1,2,3};
        System.out.println(q34.sum3(sum1));
    }
}
