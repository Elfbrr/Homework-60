package org.Q1to5;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //3- A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.
        Scanner vote = new Scanner(System.in);
        System.out.println("Enter age");
        int age = vote.nextInt();
        if (age>=18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

    }

}
