package org.Q46to50;

import java.sql.SQLOutput;

public class Q48 {
    /**48- Java Program to Calculate Simple Interest
     Simple Interest = (P x T x R)/100
     Where,

     P is the principal amount
     T is the time and
     R is the rate*/

    public double interest(double p,double t, double r){
        return (p*t*r)/100;
    }

    public static void main(String[] args) {
        Q48 q48=new Q48();

        double simpleInterest= q48.interest(2000,0.25,3.0);
        System.out.println(simpleInterest);
    }
}
