public class WhatisEnumeration {
    public static void main(String[] args){
        //Enumeration numbers a list
        enum daysofweek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATUDAY}
//      ^^ type     ^^ variable        ^^data
        daysofweek today = daysofweek.TUESDAY;
        System.out.println(today);
    }
}
