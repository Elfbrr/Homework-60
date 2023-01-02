package org.Q51to58;

public class Q55 {
     /**
      * 55- Java Program to Check Whether a Character is Alphabet or Not
      * input : isAlphabet('*')  output: false
      * input : isAlphabet('A')  output: true
      * input : isAlphabet('k')  output: true
      * input : isAlphabet('#')  output: false
      */
     public boolean isAlphabet(char a) {
          return (a >= 65 && a <= 90) || (a >= 97 && a <= 122);

     }

     public static void main(String[] args) {
          Q55 q55=new Q55();
          System.out.println(q55.isAlphabet('#'));
     }
}