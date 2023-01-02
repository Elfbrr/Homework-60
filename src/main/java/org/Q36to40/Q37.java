package org.Q36to40;

import java.util.Arrays;

public class Q37 {
    /**37- Given an array of ints length 3, figure out which is larger,
     *  the first or last element in the array, and set all the other elements to be that value.
     *  Return the changed array.

     maxEnd3([1, 2, 3]) → [3, 3, 3]
     maxEnd3([11, 5, 9]) → [11, 11, 11]
     maxEnd3([2, 11, 3]) → [3, 3, 3]*/
    public int [] maxEnd3(int [] arr){
     int elements=Math.max(arr[0],arr[2]);
     int [] result= new int [arr.length];
        Arrays.fill(result,elements);
     return result;
    }

    public static void main(String[] args) {
        Q37 q37 = new Q37();
        int [] arr= {11,5,9};
        int [] sameNumbs = q37.maxEnd3(arr);
        System.out.println(Arrays.toString(sameNumbs));
    }
}

