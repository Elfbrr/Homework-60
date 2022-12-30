package org.Q1to5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
       // 4- Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int totalOfTwoNumbers = (num1 + num2);
        System.out.println("The total of two numbers: " + totalOfTwoNumbers);
    }
}
