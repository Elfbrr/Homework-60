package org.Q46to50;

public class Q49 {
    /**49- Write a method that returns the largest integer in the list.
     You can assume that the list has at least one element.
     input : [2,5,3,14,5,25]
     output: Largest number is : 25*/
    public static int input(int [] numb){
         int largest =numb[0];
         for (int number: numb){
              if (number>largest)
                   largest=number;
         }
         return largest;
    }

     public static void main(String[] args) {
         Q49 q49=new Q49();
          int [] numb={2,5,3,14,5,25};
          System.out.println("Largest number is: " +input(numb));
     }
     }
