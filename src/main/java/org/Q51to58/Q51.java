package org.Q51to58;

public class Q51 {
    /**51- A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     Write a method that checks if a number is a prime number.*/

    public static void main(String[] args) {
         int num = 11;
         boolean flag = false;
         for (int i = 2; i <= num / 2; ++i) {
              if (num % i == 0) {
                   flag = true;
                   break;
              }
         }

         if (!flag)
              System.out.println(num + " prime number");
         else
              System.out.println(num + " not a prime number");
    }
}

