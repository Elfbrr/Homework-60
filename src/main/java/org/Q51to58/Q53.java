package org.Q51to58;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Q53 {
    /**53- Provided that you have a given number of small rice bags (1 kilo each)
    and big rice bags (5 kilos each), write a method that returns true
     if it is possible to make a package with goal kilos of rice.*/
    public boolean rice(int small, int big, int goal) {

        int sum = (small + big) * 5;
        return sum >= goal;

    }

    public static void main(String[] args) {
        Q53 q53 = new Q53();
        System.out.println(q53.rice(1,1,11));
    }
}
