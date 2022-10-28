package day34lambdafpintstreamandpojo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFPCourses {

    public static void main(String[] args) {

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(checkIfGreater(coursesList, 91));
        System.out.println(checkIfAnyMatch(coursesList, "ngli"));
        printTheBigAverage(coursesList);
        System.out.println(getSorted(coursesList, 2));
        getSorted2(coursesList, 3);
    }

    //Create a method to check if all average scores are greater than a given num
    public static boolean checkIfGreater(List<Courses> course, int a){
        return course.stream().allMatch(t-> t.getAverageScore()>a);
    }
    public static boolean checkIfAnyMatch(List<Courses> course, String a){
        return course.stream().anyMatch(t-> t.getCourseName().contains(a));
    }
    //3)Create a method to print the course whose average score is the highest
    public static void printTheBigAverage(List<Courses> course){
        String x = course.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(x);
    }
    //4) Sort the list elements according to the average score in ascending order and skip first given one.
    public static List<Object> getSorted(List<Courses> course, int a){
        return course.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(a).collect(Collectors.toList());
    }
    // //5) Homework: Sort the list elements according to the average score in ascending order and print just the given one
    public static void getSorted2(List<Courses> course, int a){
        Courses x = course.stream().sorted(Comparator.comparing(Courses::getAverageScore)).collect(Collectors.toList()).get(a);
        System.out.println(x);
    }


}




