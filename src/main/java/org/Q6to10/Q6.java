package org.Q6to10;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //6- Write a program to print the circumference and area of a circle of
        // radius entered by user by defining your own method.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circumference = getCircumference(radius);
        double area = getArea(radius);
        System.out.println("The circumference is: " + circumference);
        System.out.println("The area is: " + area);
    }

    public static double getCircumference(double r) {
        return 2 * Math.PI * r;
    }
    public static double getArea(double r) {
        return Math.PI * r * r;
    }
}

