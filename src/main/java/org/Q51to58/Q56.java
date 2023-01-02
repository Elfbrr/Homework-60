package org.Q51to58;

public class Q56 {
    /**
     * 56- Java Program to Generate Multiplication Table
     * input: multiplicationTable(5);
     * output:
     * 5 * 1 = 5
     * 5 * 2 = 10
     * 5 * 3 = 15
     * 5 * 4 = 20
     * 5 * 5 = 25
     * 5 * 6 = 30
     * 5 * 7 = 35
     * 5 * 8 = 40
     * 5 * 9 = 45
     * 5 * 10 = 50
     *
     * @return
     */
    public int multi(int a){
        for (int i = 1; i <= 10; i++) {
            int product = a * i;
            System.out.println(a + " * " + i + " = " + product);
        }

        return a;
    }


    public static void main(String[] args) {
        Q56 q56=new Q56();
        System.out.println(q56.multi(5));
    }
}
