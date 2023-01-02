package org.Q46to50;

public class Q47 {
    //47- Write a java program to find the perimeter of a rectangular, square, circle, triangle
    public static void perimeters(int a, int b,int c){
        int rec= 2*(a+b);
        int sq=4*a;
        int tri=a+b+c;
        double circ=2*3.14*(2*a);
        System.out.println("Perimeter of rectangular: " + rec);
        System.out.println("Perimeter of square: " + sq);
        System.out.println("Perimeter of triangle: " + tri);
        System.out.println("Perimeter of circle: " + circ);

    }

    public static void main(String[] args) {
        Q47 q47= new Q47();
        int a =3;
        int b=4;
        int c=5;
        perimeters(a,b,c);
    }
}
