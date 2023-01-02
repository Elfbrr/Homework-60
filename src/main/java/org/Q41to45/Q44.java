package org.Q41to45;

public class Q44 {
    /**44- Given an int array, return true if the array contains 2 twice,
     *  or 3 twice. The array will be length 0, 1, or 2.

     double23([2, 2]) → true
     double23([3, 3]) → true
     double23([2, 3]) → false*/
    public boolean double23(int [] array){
        if ((array[0]==2 && array[1]==2) || (array[0]==3 && array[1]==3))
                return true;
        return false;
    }

    public static void main(String[] args) {
        Q44 q44=new Q44();
        int [] newArray={2,3};
        System.out.println(q44.double23(newArray));
    }
}
