package org.Q36to40;

import java.util.Arrays;

public class Q36 {
    /**36- Given an array of ints length 3, return a new array with the elements in reverse order,
     * so {1, 2, 3} becomes {3, 2, 1}.

     reverse3([1, 2, 3]) → [3, 2, 1]
     reverse3([5, 11, 9]) → [9, 11, 5]
     reverse3([7, 0, 0]) → [0, 0, 7]*/

    public int [] reverse3(int [] numb){
        int [] reverse1= new int[numb.length];
        for (int i = 0; i < numb.length; i++) {
            reverse1[i]=numb[numb.length-i-1];
        }
        return reverse1;
    }

    public static void main(String[] args) {
        Q36 q36 = new Q36();
        int[] numb = {1, 2, 3};
        int[] reversed = q36.reverse3(numb);
        System.out.println(Arrays.toString(reversed));
    }
     }
