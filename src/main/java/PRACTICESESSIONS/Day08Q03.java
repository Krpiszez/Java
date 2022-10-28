package PRACTICESESSIONS;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Day08Q03 {

    // Create a method that calculates 4 students 6, 4, 3 and 5 exams avarage respectively.

    public static void main(String[] args) {
        calculateAverage ("Tom Hanks", 25,64,68,14);
        calculateAverage ("John Travolta", 35,64,68,14,82,46);
        calculateAverage ("Cuneyt Arkin", 99,100,90);

        LocalDate a = LocalDate.of(2022, Month.SEPTEMBER, 13).plusMonths(6);
        LocalDate b = LocalDate.now();
        long dif = ChronoUnit.DAYS.between(a,b);
        System.out.println(dif);
    }

    public static void calculateAverage(String name, double ...mark){

        double sum = 0;

        for (double w: mark){

            sum+=w;

        }
        double average = sum / mark.length;
        System.out.print(name + "'s Average is: " + String.format("%.2f", average));
        if (average<50){
            System.out.println(" Fail");
        }else {
            System.out.println(" Successful");
        }
    }


}
