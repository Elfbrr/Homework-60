package org.Q21to25;

public class Q25 {
    /**25- Given an array of ints, return the number of 9's in the array.

     arrayCount9([1, 2, 9]) → 1
     arrayCount9([1, 9, 9]) → 2
     arrayCount9([1, 9, 9, 3, 9]) → 3*/
    public int arrayCount9(int [] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 9)
                count++;
        }
            return count;
        }

    public static void main(String[] args) {
            Q25 q25 = new Q25();
        int[] numbers = {9, 2, 7, 9};
        System.out.println(q25.arrayCount9(numbers));
    }
}
