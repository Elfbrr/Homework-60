package org.Q31to35;

public class Q31 {

    /**31- Given an array of ints, return true if 6 appears as either the first or last element in the array.
     *  The array will be length 1 or more.

    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false*/

    public boolean firstLast6(int [] last){

        return last[0]==6 || last[2]==6;
        }

    public static void main(String[] args) {
        Q31 q31 = new Q31();
        int [] last = {1,2,6};
        System.out.println(q31.firstLast6(last));
    }
    }

