package org.Q36to40;

import java.util.Arrays;

public class Q39 {
    /**
     39- Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

     middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
     middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
     middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]*/

    public int [] middleWay(int[] a,int[] b){
         int[] c = {a[1], b[1]};
         return c;
    }

     public static void main(String[] args) {
          Q39 q39 = new Q39 ();
          int [] a={1,2,3};
          int [] b={4,5,6};
          int [] newArr=q39.middleWay(a,b);
          System.out.println(Arrays.toString(newArr));
     }
     }
