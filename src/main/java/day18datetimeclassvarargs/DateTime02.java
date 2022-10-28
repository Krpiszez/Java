package day18datetimeclassvarargs;

import org.joda.time.Minutes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime02 {

    public static void main(String[] args) {

        //Example 1: Type the code that find out how many months Ali lived. Date of birth of Ali is 4th of June 1997

        LocalDate dobAli = LocalDate.of(1997, Month.JUNE,4);
        LocalDate currentDate = LocalDate.now();

        long numOfMonths = ChronoUnit.MONTHS.between(dobAli,currentDate);//when you use the between method first one should be before
        System.out.println(numOfMonths);//303

        //Example 2: Tom was born 45 years, 8 months and 5 days after 29 October 1923.
        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //Type code to calculate the exact date of birth of Ali and Veli
        //Type code to check if the date of birth of Ali and Veli is the same or not.

        LocalDate dobTom = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dobTom);//1969-07-04
        LocalDate dobVeli = LocalDate.of(1993,Month.SEPTEMBER, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobVeli);//1969-07-04
        boolean isSame = dobVeli.isEqual(dobTom);
        System.out.println(isSame);

        //Example 3:  Type code to find the time difference in hours between Japan time zone and Germany time zone.
//            Zone id for Japan: Asia/Tokyo            Zone id for Germany: Europe/Berlin

        LocalTime dtInGermany = LocalTime.now(ZoneId.of("Europe/Berlin"));
        LocalTime dtInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        long diff = ChronoUnit.HOURS.between(dtInGermany,dtInJapan);
        System.out.println(diff);




    }
}
