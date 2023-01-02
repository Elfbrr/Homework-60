package org.Q36to40;

import java.util.Arrays;

public class Q38 {
    /**
     * 38- Given an array of ints, return the sum of the first 2 elements in the array.
     * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
     * <p>
     * sum2([1, 2, 3]) → 3
     * sum2([1, 1]) → 2
     * sum2([1, 1, 1, 1]) → 2
     */
    public int sum2(int[] array) {
        if (array.length == 1)
        return array[0];
        if (array.length == 0)
        return 0;
        return array[0] + array[1];
    }



    public static void main(String[] args) {
        Q38 q38 = new Q38();
        int[] array = {1, 2, 3};
        System.out.println(q38.sum2(array));
    }
}
