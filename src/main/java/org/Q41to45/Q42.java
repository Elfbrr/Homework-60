package org.Q41to45;

public class Q42 {
    /**42- Given an int array length 2, return true if it does not contain a 2 or 3.

     no23([4, 5]) → true
     no23([4, 2]) → false
     no23([3, 5]) → false*/
    public boolean no23 (int [] arrayNew){
        if ((arrayNew[0]!=2 && arrayNew[0]!=3) && (arrayNew[1]!=2 && arrayNew[1]!=3))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Q42 q42=new Q42();
        int [] array1={4,5};
        System.out.println(q42.no23(array1));
    }
}
