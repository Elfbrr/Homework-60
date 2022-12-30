package org.Q6to10;

import java.util.Scanner;

public class Q7 {
      //7- Define a method to find out if number is prime or not.
      public static void main(String[] args) {
          Scanner prime= new Scanner(System.in);
          System.out.println("Enter the number");
          int number=prime.nextInt();

          if (number==2 || number==3) {
              System.out.println("This is a prime number");
          }else if (number%2!=0){
              System.out.println("This is prime number");
          }else{
              System.out.println("This is not prime number");
          }




      }
}
