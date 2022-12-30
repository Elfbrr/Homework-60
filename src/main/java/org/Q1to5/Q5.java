package org.Q1to5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //5- Define a method that returns the product of two numbers entered by user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numb1= input.nextInt();
        int numb2= input.nextInt();
        int product= returning(numb1,numb2);
        System.out.println("Multiplying two numbers result is " + product);
    }
    public static int returning(int a, int b){
        return a*b;
    }

}
