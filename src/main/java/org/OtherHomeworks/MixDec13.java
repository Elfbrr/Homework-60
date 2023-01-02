package org.OtherHomeworks;

import java.util.Arrays;
import java.util.Scanner;

public class MixDec13 {

    //1- Write a method that takes an integer minutes, converts it to seconds and returns as long.
    //1. write a method that can convert km to miles
    // 2. write a method that can convert gallons to litters

    public static void main(String[] args) {
        MixDec13 sc = new MixDec13();
        sc.calculation1(120, 0, 0.612); //km to miles
        sc.calculation1(30, 0, 3.75); //gallon to litre
        sc.calculation(1, 0, 60); //minute to second
        sample(); //Question 2 ==> 2- Write a method that returns true when x is equal to y; otherwise return false.

        //3. write a method that can print out the array in Descending order
        int[] numbers1 = {40, 50, 78, 12, 6};
        sc.convertNumber(numbers1);
        System.out.println();


        /**5. write a method that can calculate grade
         //			if score is 100 ~ 90 ==> A
         //			if score is 89 ~ 80 ==> B
         //			if score is 79 ~ 70 ==> C
         //			if score is 69 ~ 60 ==> D
         //			if score is 0 ~ 59 ==> F
         //			otherwise ==> Invalid Score*/

        java.util.Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your grade");
        int numb = sc1.nextInt();
        MixDec13 mo = new MixDec13();
        mo.grade(numb);


        /**6. Write a Java method to multiply corresponding elements of two arrays of integers.
         Sample input:
         Array1: [1, 3, -5, 4]
         Array2: [1, 4, -5, -2]*/


        int[] leftArray = {1, 3, -5, 4};
        int[] rightArray = {1, 4, -5, -2};
        String result = "";
        for (int i = 0; i < leftArray.length; i++) {
            result += Integer.toString(leftArray[i] * rightArray[i]) + " ";
        }
        System.out.println(result);



        /**7. Write a Java program start with an integer n,
         *divide n by 2 if n is even or multiply by 3 and add
         *  1 if n is odd, repeat the process until n = 1.*/
        System.out.println("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n + 1) / 2;
            }
        }
        System.out.println("n = " + n);
        in.close();

        /**8. Write a Java program to check if a number is Armstrong's number or not?
         (input 153= 1*1*1 + 5*5*5 + 3*3*3 =153 output true,  123 output false)*/
        int y=1634;
        int temp=y;
        int total=0;
        String number= Integer.toString(y);
        int length = number.length();
        for (int i=0; i<length; i++){
            int result1 = temp%10;
            total= (int) (total+Math.pow(result1, length));
            temp=temp/10;
        }
        if (total==y) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }


    public void calculation1(int a, double b, double e) {
        System.out.println(b = a * e);

    }

    public void calculation(int a, int b, int e) {
        System.out.println(b = a * e);
    }


    public void convertNumber(int[] array) {
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");


        }
    }

    //2- Write a method that returns true when x is equal to y; otherwise return false.
    public static boolean xequaly(int x, int y) {
        return (x == y);
    }
    public static void sample() {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        x = sc.nextInt();
        System.out.println("Enter y");
        y = sc.nextInt();
        System.out.println(xequaly(x, y));

    }

    public void grade(int numb) {


        if (numb >= 90 && numb <= 100) {
            System.out.println("A");
        } else if (numb >= 80 && numb <= 89) {
            System.out.println("B");
        } else if (numb >= 70 && numb <= 79) {
            System.out.println("C");
        } else if (numb >= 60 && numb <= 69) {
            System.out.println("D");
        } else if (numb >= 0 && numb <= 59) {
            System.out.println("F");
        } else {
            System.out.println("Invalid score");
        }

    }

}

