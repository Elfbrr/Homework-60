package org.Q31to35;

public class Q32 {
    /**32- Given an array of ints, return true if the array is length 1 or more,
     * and the first element and the last element are equal.

     sameFirstLast([1, 2, 3]) → false
     sameFirstLast([1, 2, 3, 1]) → true
     sameFirstLast([1, 2, 1]) → true*/

    public boolean sameFirstLast(int [] array){
         return array.length>=1 && array[0]==array[3];
    }

     public static void main(String[] args) {
          Q32 q32 = new Q32();
          int [] array = {1,2,3,1};
          System.out.println(q32.sameFirstLast(array));
     }
     }
