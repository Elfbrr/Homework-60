package org.Q1to5;

import java.util.Scanner;

public class Q1 {
   //1- Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number");
       int first = sc.nextInt();
       System.out.println("Enter second number");
       int second = sc.nextInt();
       System.out.println("Enter third number");
       int third = sc.nextInt();

       Q1 maxi = new Q1();
       maxi.minimum(first,second,third);
       maxi.maximum(first,second,third);
   }

    public void minimum(int first, int second, int third){

       if (first<=second || first<=third){
           System.out.println("This minimum number is " + first);
       }else if (second<=first || second<=third){
           System.out.println("This minimum number is " + second);
       }else if (third<=first || third<=second){
           System.out.println("This minimum number is " +third);
       }

    }

    public void maximum(int first, int second, int third){
        if (first>=second || first>=third){
            System.out.println("This maximum number is " + first);
        }else if (second>=first || second>=third){
            System.out.println("This maximum number is " + second);
        }else if (third>=first || third>=second){
            System.out.println("This maximum number is " +third);
        }
    }

}
