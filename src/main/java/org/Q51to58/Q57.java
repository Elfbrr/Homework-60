package org.Q51to58;

public class Q57 {
    /**
     * 57- Java Program to Reverse a Number
     * input: reverseNumber(3798); output: 8973
     */
    public int reverseNumber(int num) {
        int result = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result;
    }


    public static void main(String[] args) {
        Q57 q57 = new Q57();
        int reversedNumber = q57.reverseNumber(3798);
        System.out.println(reversedNumber);

    }
}
