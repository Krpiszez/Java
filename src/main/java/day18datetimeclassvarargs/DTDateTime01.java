package day18datetimeclassvarargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DTDateTime01 {
    public static void main(String[] args) {

        //How to get current date in Java code
        LocalDate currentDate= LocalDate.now();
        System.out.println(currentDate); //2022-09-28

        //How to get "current time" by typing Java code
        LocalTime currentTime= LocalTime.now();
        System.out.println(currentTime);//18:05:03.103885900

        //How to get "current date and time" by Java
        LocalDateTime currentDateTime= LocalDateTime.now();
        System.out.println(currentDateTime);//2022-09-28T18:07:17.786758

        //How to get current date in another country by typing Java codes
        LocalDateTime currentDateTimeInJapan1= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan1);  //2022-09-28

        //How to get current date and time in another country
        LocalDateTime currentDateTimeInJapan2= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan2); //2022-09-29T00:15:17.167815900



    }
}
