package org.Q26to30;

import org.Q1to5.Q3;

public class Q30 {
    /**
     * 30- Given an array of ints, return true if it contains a 2, 7, 1 pattern:
     * a value, followed by the value plus 5, followed by the value minus 1.
     * Additionally, the 271 counts even if the "1" differs by 2 or less from the correct value.
     * <p>
     * has271([1, 2, 7, 1]) → true
     * has271([1, 2, 8, 1]) → false
     * has271([2, 7, 1]) → true
     */

    public boolean has271(int[] value) {
        for (int i = 0; i < value.length - 1; i++) {
            if ((value[i + 1] == value[i] + 5 && (value[i + 2] == value[i] - 1 || value[i + 2] == value[i] - 2)))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Q30 q30 = new Q30();
       int [] value = {2,7,1};
        System.out.println(q30.has271(value));
    }
}

