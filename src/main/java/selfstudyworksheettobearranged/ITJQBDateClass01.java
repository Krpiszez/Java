package selfstudyworksheettobearranged;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class ITJQBDateClass01 {

    public static void main(String[] args) {

        //1) Type the code that finds out how many days Ali lived.
        //Date of birth of Ali is 12th of May 2002


//        LocalDate dobAli = LocalDate.of(2002, Month.MAY, 12);
//        LocalDate cD = LocalDate.now();
//        long daysAliLived = ChronoUnit.DAYS.between(dobAli, cD);
//        System.out.println(daysAliLived);//7444

        //2) Type the code that finds out how many months Tom lived.
        //Date of birth of Tom is 4th of June 1997

//        LocalDate dobTom = LocalDate.of(1997, Month.JUNE, 4);
//        long daysTomLived = ChronoUnit.MONTHS.between(dobTom, cD);
//        System.out.println(daysTomLived);//303

        //3) Date of birth of Tom is 4th of June 1997. Type code to find the exact date 2 years, 3 months,
        //and 12 days after Tom's birth date.

//        LocalDate exactDate = dobTom.plusYears(2).plusMonths(3).plusDays(12);
//        DateTimeFormatter exactUpDate = DateTimeFormatter.ofPattern("dd/MM/yy");
//        System.out.println(exactUpDate.format(exactDate));//1999-09-16

        //4) Ali was born 45 years, 8 months and 5 days after 29 October 1923.
        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //Type code to calculate the exact date of birth of Ali and Veli
        //Type code to check if the date of birth of Ali and Veli is the same or not.

//        LocalDate dobAli = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
//        LocalDate dobVeli = LocalDate.of(1993, Month.SEPTEMBER, 15).minusYears(24).minusMonths(2).minusDays(11);
//        System.out.println(dobAli);//1969-07-04
//        System.out.println(dobVeli);//1969-07-04
//        boolean isSame = dobAli.isEqual(dobVeli);
//        System.out.println(isSame);//true

        //5) Veli was born 3 years and 11 days after Ali.
        //Ali gave you his date of birth as 24th of November 2012
        //Type code to calculate Veli’s date of birth.

//        LocalDate dobAli = LocalDate.of(2012, Month.NOVEMBER, 24);
//        LocalDate dobVeli = dobAli.plusYears(3).plusDays(11);
//        DateTimeFormatter upDate = DateTimeFormatter.ofPattern("dd/MM/yy");
//        String upDobVeli = upDate.format(dobVeli);
//        System.out.println(upDobVeli);//05/12/15

        //6) Create a Date Value for your birthdate and create Date Value for your kid's birth date then
        //calculate the difference in days.

//        LocalDate mBD = LocalDate.of(1993,11,29);
//        LocalDate mKBD = LocalDate.of(2023,10,22);
//        long diffDay = ChronoUnit.DAYS.between(mBD,mKBD);
//        System.out.println(diffDay);//10919

        //7) Get the last 2 digits of the year in current date

//        LocalDate cD = LocalDate.now();
//        DateTimeFormatter uCD = DateTimeFormatter.ofPattern("dd/MM/yy");
//        String today = uCD.format(cD);
//        System.out.println(today);//28/09/22

        //8) Type code to check if a given year is “Leap year” or not
        //Leap Year:
        //i) If a year is divisible by 100 and divisible by 400 it is called leap year. For example; 2000 is, 1900
        //is not
        //ii) If a year is not divisible by 100 and divisible by 4 it is called leap year. For example; 2004 is, 2007
        //is not

//        int year = 2009;
//
//        if (year % 100==0&&year%400==0){
//            System.out.println("leap");
//        } else if (year % 100 !=0 && year %4==0 ) {
//            System.out.println("leap");
//        }else {
//            System.out.println("not");
//        }

//        LocalDate year = LocalDate.of(1996, 12, 24);
//        boolean isLeap = year.isLeapYear();
//        System.out.println(isLeap);

        //9) Find the sum of the month numbers of two different dates

//        LocalDate year1 = LocalDate.of(1992, 11, 12);
//        LocalDate year2 = LocalDate.of(1993, 11, 29);
//        int m1 = year1.getMonthValue();
//        int m2 = year2.getMonthValue();
//        System.out.println(m1+m2);

        //10) Find the difference in hours for two different dates

//        LocalDate d1 = LocalDate.of(1992, 11, 19);
//        LocalDate d2 = LocalDate.of(1994, 10, 23);
//        long diff = ChronoUnit.HOURS.between(d2, d1);//ERROR ???

        //1) If the hour is
        //i) Between 24:00 and 05:00 then print ‘Sleeping time’ on the console
        //ii) Between 08:00 and 16:00 then print ‘Working time’ on the console
        //iii) Between 19:00 and 22:00 then print ‘Family time’ on the console
        //iv) For the others print ‘Personal time’ on the console

//        LocalTime ct = LocalTime.now();
//        int hour = ct.getHour();
//        if (hour>0&&hour<5){
//            System.out.println("Sleeping");
//        }else if (hour>8&&hour<16){
//            System.out.println("Working");
//        } else if (hour>19&&hour<22) {
//            System.out.println("Family");
//        }else {
//            System.out.println("Personal");
//        }

        //2) Type code to find time difference between Japan time zone and Germany time zone

//        LocalTime japan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
//        System.out.println(japan);
//        LocalTime germany = LocalTime.now(ZoneId.of("Europe/Berlin"));
//        System.out.println(germany);
//        long diff = ChronoUnit.HOURS.between(japan, germany);
//        System.out.println(diff);

        //3) Ali was born in Istanbul on 5th of February 2015 at 10:00 am TRT, Mark was born in the USA
        //on 5th of February 2015 at 12:00 pm EST. What is the difference between Ali’s birth time
        //and Mark’s birth time in hours?*****

//        LocalDateTime dobAli = LocalDateTime.of(2015, Month.FEBRUARY, 5, 10, 00);
//        ZonedDateTime zDobAli = dobAli.atZone(ZoneId.of("Europe/Istanbul"));
//        LocalDateTime dobMark = LocalDateTime.of(2015, Month.FEBRUARY, 5, 12, 00);
//        ZonedDateTime zDobMark = dobMark.atZone(ZoneId.of("America/New_York"));
//
//        long diff = ChronoUnit.HOURS.between(zDobAli, zDobMark);
//        System.out.println(diff);

        //4) Ali was born on 5th of February 2015 at 10:15 am EST, Mark was born on 6th of March 2015
        //at 12:25 pm EST. Ali remained in intensive care for 23 hours and 35 minutes. Veli remained
        //in intensive care for 1 hour and 12 minutes. What is the difference in minutes between the
        //times of Ali and Veli leaving the intensive care unit?

//        LocalDateTime lICUAli = LocalDateTime.of(2015,Month.FEBRUARY, 5, 10, 15).plusHours(23).plusMinutes(35);
//        LocalDateTime lICUMark = LocalDateTime.of(2015, Month.MARCH, 6, 12,25).plusHours(1).plusMinutes(12);
//        long diff = ChronoUnit.MINUTES.between(lICUAli, lICUMark);
//        System.out.println(diff);

        //5) Mark was born on 2/23/2018 at 3:25 PM in GMT. What is the exact birth date and time of
        //Mark in Japan?
//        LocalDateTime gmt = LocalDateTime.now(ZoneId.of("GMT"));
//        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
//        long min = ChronoUnit.MINUTES.between(gmt, japan);
//        System.out.println(min);
//        LocalDateTime dobMark = LocalDateTime.of(2018, 2, 23, 15, 25);
//        LocalDateTime inJapanOnDOBMark = dobMark.minusMinutes(min);
//        System.out.println(inJapanOnDOBMark);


    }
}
