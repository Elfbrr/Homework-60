package org.Q26to30;

public class Q28 {
   /**28- Given an array of ints, return the number of times that two 6's are next to each other in the array.
    *  Also count instances where the second "6" is actually a 7.

    array667([6, 6, 2]) → 1
    array667([6, 6, 2, 6]) → 1
    array667([6, 7, 2, 6]) → 1*/

   public int array667(int [] number){
     int count = 0;
       for (int i = 0; i < number.length-1; i++) {
           if (number[i]==6)
               if(number[i]==6 && (number[i+1]==6 || number[i+1]==7))
                 count+=1;

       }
       return count;
   }

    public static void main(String[] args) {
        Q28 q28= new Q28();
        int []number = {6,7,2,6};
        System.out.println(q28.array667(number));
    }

}
