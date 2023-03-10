package org.Q26to30;

public class Q26 {
    /**
     * 26- Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * <p>
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     */

    public boolean arrayFront9(int[] numbs) {

        for (int i = 0; i < 4; i++) {
            if (numbs[i] == 9)
                return true;
        }
                return false;
    }

    public static void main(String[] args) {
        Q26 q26 = new Q26();
        int [] numbs = {1, 2, 3, 4, 9};
        System.out.println(q26.arrayFront9(numbs));
    }
}
