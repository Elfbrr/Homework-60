package org.Q41to45;

import java.util.Arrays;

public class Q43 {
    /**43- Given an int array, return a new array with double the length
     * where its last element is the same as the original array,
     * and all the other elements are 0. The original array will be length 1 or more.
     * Note: by default, a new int array contains all 0's.

     makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
     makeLast([1, 2]) → [0, 0, 0, 2]
     makeLast([3]) → [0, 3]*/

    public int [] makeLast(int [] makeArray){
        int[] elements = new int[makeArray.length * 2];
        elements[elements.length - 1] = makeArray[makeArray.length - 1];
        return elements;
    }

    public static void main(String[] args) {
        Q43 q43 = new Q43();
        int [] array= {4,5,6};
        int [] array1= q43.makeLast(array);
        System.out.println(Arrays.toString(array1));
    }
}
