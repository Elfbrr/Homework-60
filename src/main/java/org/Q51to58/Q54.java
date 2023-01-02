package org.Q51to58;

public class Q54 {
    /**54- Java Program to Check Whether a Number is Positive or Negative
     input: isPositive(12.0)  output: true
     input: isPositive(-3)  output: false
     input: isPositive(-4.3)  output: false
     input: isPositive(5.5)  output: true*/

    public boolean negPos(double a){
        return a>0;
    }

    public static void main(String[] args) {
        Q54 q54 = new Q54();
        System.out.println(q54.negPos(5.5));
    }
}
