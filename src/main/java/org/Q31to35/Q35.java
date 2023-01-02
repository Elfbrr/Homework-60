package org.Q31to35;

import java.util.Arrays;

public class Q35 {
    /**
     * 35- Given an array of ints length 3, return an array with the elements "rotated left"
     * so {1, 2, 3} yields {2, 3, 1}.
     * <p>
     * rotateLeft3([1, 2, 3]) → [2, 3, 1]
     * rotateLeft3([5, 11, 9]) → [11, 9, 5]
     * rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */

    public int [] rotateLeft3(int [] arrayNum) {
        return new int []{arrayNum[1], arrayNum[2], arrayNum[0]};

    }
    public static void main(String[] args) {
        Q35 q35= new Q35();
        int[] rotated = q35.rotateLeft3(new int[] {1, 2, 3});
        System.out.println(Arrays.toString(rotated));
    }
    }


