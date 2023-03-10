package org.Q6to10;

public class Q10 {
    /**
     * 10- We have two monkeys, a and b,
     * and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     * <p>
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     */
    boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Q10 question = new Q10();
        System.out.println(question.monkeyTrouble(true,false));

    }
}
