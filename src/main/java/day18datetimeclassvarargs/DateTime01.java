package day18datetimeclassvarargs;


import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //How to get "current date" by typing Java code.

        LocalDate currentDate = LocalDate.now();//this is an object like Scanner we import this from Java.time library
                                                // there are 2 types of object creation 1 from scratch (nothing) other is like this. we dont type new keyword here.
        System.out.println(currentDate);//2022-09-28 This is the current date and its default type of typing date in java (LocalDate.now()).

        //How to get "current time" by typing Java code.

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);//01:10:47.232994 it is using 24 hours system as default format

        //How to get current data and time by typing Java code.

        LocalDateTime currentDateTime = LocalDateTime.now();//Here you will get date and time together
        System.out.println(currentDateTime);//2022-09-28T01:13:29.528668 // first part is date T==> Time

        //How to get "current date" in another country by typing Java code.

        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);//2022-09-28 current date in Japan

        //How to get "current time" in another country by typing Java code.

        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);//08:25:28.867323

        //How to get current data and time in another country by typing Java code.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-09-28T08:25:28.867323

        //How to go future in date
        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);//2022-09-28
        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);//If you use multiple methods in same line it's called method chain.
        System.out.println(cd1Next);//2025-06-28

        //How to go past in date
        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);//2019-07-23

        //Homework: Type code to learn how to go future and past in time. .plusHours() .minusMinutes()....

        //How to get a specific part of the time
        LocalTime ct1 = LocalTime.now();
        int hour = ct1.getHour();
        System.out.println(hour);//1

        int minute = ct1.getMinute();
        System.out.println(minute);//43

        //How to change the format of the date.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Uppercase 'M' is for Month lowercase 'm' is for minute.
        String formattedCurrentDate = dtf.format(cd1);//we created a date variable before now we change its format.
        System.out.println(formattedCurrentDate);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");//"MMM" gives you the first 3 characters of the month name
        String formattedCurrentDate2 = dt.format(cd1);                  //"yy" gives you the last 2 digits of the year
        System.out.println(formattedCurrentDate2);//28/Sep/22

        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/MMMM/yyyy");//"MMMM" gives you the full month name
        String formattedCurrentDate3 = d.format(cd1);                  //'d' if the day is one digit it won't give you initial 0.
        System.out.println(formattedCurrentDate3);//28/September/2022

        //How to change the format of the time.
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("HH.mm.a");//You can change the time format by typing this.=== 'a' give you am or pm in 12hours system.
        LocalTime lt = LocalTime.now();                              //If you type "HH" in uppercase it will use 24 hours system. "hh"==>12 hours system.
        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);//02.00

         /*
            Enum is something like class normally in a class you have variables and methods. In Enums you may have variables and methods
            as well. but when we create enum we use it to store constant variables. Unchangeable variables. like months...
            Whenever you need Unchangeable variables use enum.
            For example, you are creating for Honda - Honda has some models like Civic HRV ...
            their names will not change anytime honda civic exists for many years.
            If you are sure they will remain same for long time.you are creating application for Honda you will use civic model many times in your application.
            You put them in enum when you need models you go to enum select it from there and use. you don't need to memorise model names.
            Go to enum and get the one you need. When you  create a value in enum you can add values?
            For example, you are working with states in the USA create a enum and put states in it. then you create method to get variables from that enum.
         */

        //How to create specific dates
        LocalDate dob1 = LocalDate.of(2012, 3, 13);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY, 21);

        //How to compare two dates
        //In .isBefore() method if the first date is before the second date you get true.
        //Otherwise,(equality and first is after) you will get false.
        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is = dob1.isBefore(dob2);
        System.out.println(is);//false

        boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter);//true





    }
}
