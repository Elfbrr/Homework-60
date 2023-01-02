package org.Q26to30;

public class Q27 {
    /**
     * 27- Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     * <p>
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     */
    public boolean array123(int[] numb) {
        for(int i = 0; i < numb.length - 2; i++) {
            if(numb[i] == 1 && numb[i + 1] == 2 && numb[i + 2] == 3){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Q27 q27 = new Q27();
        int [] numb = {1, 1, 2, 1, 2, 3};
        System.out.println(q27.array123(numb));
    }
}
