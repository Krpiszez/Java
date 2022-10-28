package day20accessmodifiersinheritance;

public class Student {
    //It is accessible from the entire project, there is no restriction.
    public String stdName = "Tom Hanks";

    //It can be used just inside the "Student" Class.
    //It can be used just inside the class it was created.
    private String stdId = "TH202217007";

    //It can be used just inside the "day20accessmodifiersinheritance" package.
    //It can be used just inside the package it was created.
    double stdGpa = 3.83;//If you don't type any access modifier it will be "default".

    //It can be used just inside the "day20accessmodifiersinheritance" package. And from
    //the child classes in other packages.
    protected String stdAddress = "Miami, FL USA";

    //Following ones are "static" things do not use "object", use class name.
    public static String Name = "Tom Hanks";
    private static String Id = "TH202217007";
    static double gpa = 3.83;//default ones are open to a small group.It will be open just
    // to the package it was created in.( Default == Package Private )
    protected static String address = "Miami, FL USA";// protected means for a group and
    //their child. It means has to be in the same package.

    /*
        1)What is the difference between "default" and "protected" access modifiers?
            i)"protected" access modifier is wider than "default" modifier
            ii)"default" ones cannot be used from outside the package, therefore it's other name is "package private"
               "protected" ones can be used form the class in other packages if the classes are "child classes"

        2)Could you please tell the name of the access modifiers from the narrowest to the widest?
             private < default < protected < public

        3)Could you please explain all access modifiers?
             ...
     */

    //Note: A Class can not be "private" and can not be protected.



}
