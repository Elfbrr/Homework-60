package org.Q6to10;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /**8- Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
         Marks        Grade
         91-100         AA
         81-90          AB
         71-80          BB
         61-70          BC
         51-60          CD
         41-50          DD
         <=40          Fail*/

        Scanner grade = new Scanner(System.in);
        System.out.println("Enter your grade");
        int grades=grade.nextInt();

        if (grades>= 91 && grades <= 100) {
            System.out.println("AA");
        } else if (grades >= 81 && grades <= 90) {
            System.out.println("AB");
        } else if (grades >= 71 && grades <=80) {
            System.out.println("BB");
        } else if (grades >=61 && grades <= 70) {
            System.out.println("BC");
        }else if (grades >=51 && grades<= 60) {
            System.out.println("CD");
        }else if (grades >=41 && grades<= 50) {
            System.out.println("DD");
        }else {
            System.out.println("Failed");
        }
    }
}
