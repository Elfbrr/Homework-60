package org.Q41to45;

public class Q45 {
   /** 45- Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
    * and a boolean indicating if we are on vacation,
    * return a string of the form "7:00" indicating when the alarm clock should ring.
    * Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
    * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

    alarmClock(1, false) → "7:00"
    alarmClock(5, false) → "7:00"
    alarmClock(0, false) → "10:00"*/

   public String alarm(int days, boolean vacation){
       if (vacation){
           if(days!=0 && days!=6)
               return "10:00";
           if (days==0 && days==6)
               return "off";
       }else if (days>0 && days<6)
           return "7:00";
       return "10:00";
   }

    public static void main(String[] args) {
        Q45 q45 = new Q45();
        System.out.println(q45.alarm(5,false));
    }
}
