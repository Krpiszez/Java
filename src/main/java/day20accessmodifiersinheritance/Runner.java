package day20accessmodifiersinheritance;

public class Runner {

    public static void main(String[] args) {

        //I accessed data on the object
        Student std1 = new Student();
        System.out.println(std1.stdName);//Tom Hanks

        Student std2 = new Student();
        System.out.println(std2.stdGpa);// 3.83

        //If you want to access data inside the class
        //without using any object, the data must be static
        System.out.println(Student.address);//Miami, FL USA


    }

}