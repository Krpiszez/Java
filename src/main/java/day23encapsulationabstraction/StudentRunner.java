package day23encapsulationabstraction;

public class StudentRunner {
    /*
        Encapsulation
        Encapsulation is "data hiding".
        To hide a data we make the access modifier "private".
        After "hiding data", you made need to "read" or "update" the data.
        to "read" or "update" the data we will create some methods().
        To "read" encapsulated data you should create "get()" methods we name it "getters".
        To ""update"" encapsulated data you should create "set()" methods we name it "setters".
        "Getter" and "Setter" methods() are "Java Bean".
         */

    public static void main(String[] args) {

        Student std1 = new Student();

        System.out.println(std1.name);

        System.out.println(std1.getStdId());

        System.out.println(std1.getStdGpa());

        std1.setDisease(null);

        System.out.println(std1.getDisease());// it was "heart disease" but after set() method it gives set() methods value.

        std1.setStdGpa(4.0);

        System.out.println(std1.getStdGpa());

        std1.setSuccessful(true);

        System.out.println(std1.isSuccessful());
    }
}
