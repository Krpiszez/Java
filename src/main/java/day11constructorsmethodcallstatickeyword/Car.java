package day11constructorsmethodcallstatickeyword;

public class Car {

    /*
    When you create a class you will use it to create an object most probably, Java knows it.
    Because of that shen you create a class Java puts "constructor" in it automatically, its name is "Default Constructor"
    Default constructor is invisible. When you create your own constructor Java deletes the default constructor.
     */


    //How to create a "constructor"
    // Note; constructor name must be same with the class name, for constructor there is no return type. But in method creation
    // you can give any name to method.
    //What is the difference between "Constructors" and "Methods"
    //Note 1 constructor do not have return type but methods have.
    //Note2 Constructor name must match with the class name but method name can be any name.
    //Note3 Constructors are used to create objects but methods are used to crete some actions.
    // Note; If any class you want to use are in the same package then there is no need to import. But if the
    //class is in different package then you have to import it. You will understand that you need to import Java will direct you.

    String make = "Toyota";
    String model = "Prius";
    int year = 2020;
    int price = 20000;


    public Car (){
        System.out.println("Car Constructor 1");
    }

    public Car(String make, String model, int year, int price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

}
