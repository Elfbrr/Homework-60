package org.OtherHomeworks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MixedDec25 {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        if (x++ < ++y){
            System.out.println("Hello");
        }else {
            System.out.println("Welcome");
        }
        System.out.println("Log " + x + ":" + y); // q1 Output ===> A) Hello Log 2 : 2

            int i = 10;
            int j = 20;
            int k = (j += i) / 5;
            System.out.println(i + ":" + j + ":" + k); //q2 Output ===> A)10:30:6

        String date = LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date); // q3 Output D)An exception is thrown at runtime.


        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        do {
            idx++;
        } while (idx < size-1);
        System.out.println("The Top element: " + stack[idx]);

        //Output ===> q4 C.Option C.


/**Which statement is true about the switch statement?
 A. It must contain the default section.
 B. The break statement, at the end of each case block, is mandatory.
 C. Its case label literals can be changed at runtime.
 D. Its expression must evaluate to a single value.*/

        //q5 Output ==> B



        /**public void printFileContent () throws IOException{

         //throw new IOException();

         }
         }

         class Test {
         public static void main(String[] args) throws Exception {
         Question06 xobj = new Question06();
         xobj.printFileContent();

         }

         }
         //q6 Output ==> Option C and Option E*/


       /** String [] [] arr = {{"A", "B", "C"},{"D", "E"}};
        for (int i = 0; i < arr.length ; i++) { //0
            for (int j = 0; j < arr[i].length; j++) { //
                System.out.print(arr [i][j] + " ");
                if (arr[i][j].equals("B")) {
                    continue;
                }

            }
            continue;     //q8 Output ===> B) A B C D E
        }*/


       /**public class Question9 {
        int r;
        Question9(int r) {
        this.r = r;
        }
        }
        class DVD extends Question9 {
        int c;

        DVD(int r, int c) {
        super (r);
        this.c = c;
        System.out.println(r + " " + c);

        }
        public static void main(String[] args) {
        DVD dvd = new DVD(10,20);
        }

        q9 Output ===> C)super (r);
        this.c = c;


    }*/

        /**public static void main(String[] args) {
            int var1 = 200;
            System.out.println(doCalc(var1));
            System.out.println (var1);

        }
        static int doCalc(int var1){
            var1 = var1 * 2;
            return var1;     //q10 Output ===> A)400 200
        }*/


}
}
