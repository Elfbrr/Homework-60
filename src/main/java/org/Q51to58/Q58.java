package org.Q51to58;

public class Q58 {
    /**
     * 58- Java Program to Calculate the Power of a Number
     * input: powerOfANumber(3,4); output: 81
     * input: powerOfANumber(2,5); output: 32
     *
     * @return
     */
public int powerOfNumber(int a, int b){
    System.out.println((int)Math.pow(a,b));

    return a;
}

    public static void main(String[] args) {
        Q58 q58=new Q58();
        int power = q58.powerOfNumber(3, 4);
        System.out.println(power);
    }
}
