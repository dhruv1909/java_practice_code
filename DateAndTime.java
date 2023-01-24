package org.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        java.sql.Time time = new java.sql.Time(millis);
        System.out.println(date);
        System.out.println(time);
    }
}

// Another way

class GetDateAndTime{
    public static void main(String[] args) {
        int day = 0, month,year;
        int second,minute,hour;
        GregorianCalendar date = new GregorianCalendar();
        //date = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
        System.out.println("Current date is "+ day +"/"+(month+1)+"/"+year);
        System.out.println("Current time is "+hour+" : "+minute+" : "+second);
    }
}

     