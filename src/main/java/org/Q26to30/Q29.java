package org.Q26to30;

public class Q29 {
   /** 29- Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    *  Return true if the array does not contain any triples.

    noTriples([1, 1, 2, 2, 1]) → true
    noTriples([1, 1, 2, 2, 2, 1]) → false
    noTriples([1, 1, 1, 2, 2, 2, 1]) → false*/

   public boolean noTriples(int [] triples){
       for (int i = 0; i < triples.length-2; i++) {
           if (triples[i]==triples[i+1] && triples[i+1]== triples [i+2])
               return false;
       }
       return true;
   }

    public static void main(String[] args) {
        Q29 q29 =new Q29();
        int [] triples = {1,1,2,2,2,1};
        System.out.println(q29.noTriples(triples));
    }

}
