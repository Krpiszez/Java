package day31lambda;

import day34lambdafpintstreamandpojo.Courses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Review05 {

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
        System.out.println(isGreaterThaNinOn(coursesList,91));
        System.out.println(doesHaveWord(coursesList, "Turkish"));
        getTheHighestScore(coursesList);
        System.out.println(sortAccordingScoreOtherThanFirstTwo(coursesList,2));
        System.out.println(printThirdAfterSortAccSco(coursesList,2));
        System.out.println(printThirdAfterSortAccSco2(coursesList));

    }
    public static boolean isGreaterThaNinOn(List<Courses> list, double x){
        return list.stream().allMatch(t-> t.getAverageScore()>x);
    }
    public static boolean doesHaveWord(List<Courses> list, String str){
        return list.stream().anyMatch(t-> t.getCourseName().contains(str));
    }
    public static void getTheHighestScore (List<Courses> list){
        Courses result = list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get();
        System.out.println(result);
    }
    public static List<Courses> sortAccordingScoreOtherThanFirstTwo (List<Courses> list, int x){
        List<Courses> res = list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());
        return res;
    }
    public static Courses printThirdAfterSortAccSco (List<Courses> list, int x){
        Courses res = list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).collect(Collectors.toList()).get(x);
        return res;
    }
    public static List<Courses> printThirdAfterSortAccSco2 (List<Courses> list){
        List<Courses> res = list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(2).limit(1).collect(Collectors.toList());
        return res;
    }

}
