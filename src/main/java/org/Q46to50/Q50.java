package org.Q46to50;

public class Q50 {
    /**
     * 50- Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
     * For numbers which are multiples of both three and five return 'FizzBuzz'.
     * For numbers that are neither, return the input number.
     */
    public static String input(int a) {

        if (a % 3 == 0 & a % 5 == 0)
            return "FizzBuzz";
        else if (a % 3 == 0)
            return "Fizz";
        else if (a % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(a);
    }

    public static void main(String[] args) {
        System.out.println(input(5));
        System.out.println(input(3));
        System.out.println(input(15));
        System.out.println(input(2));
    }
}
