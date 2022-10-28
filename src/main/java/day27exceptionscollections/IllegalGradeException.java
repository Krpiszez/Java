package day27exceptionscollections;
//To make a class "Exception Class" make it child of the "Exception Class" by using "extends" keyword.
//Whenever you are creating an "Exception Class" use the Exception at the end of the class name ==> This is general usage.
//If you use "extends Exception" it will be "Compile Time Exception"(Checked Exception)
public class IllegalGradeException extends Exception {

    public IllegalGradeException(String message){//While creating constructor we use message as parameter.
    super(message);
    }

}
