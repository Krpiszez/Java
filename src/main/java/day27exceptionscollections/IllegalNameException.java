package day27exceptionscollections;
//When you extend to "RuntimeException" Class , your "Custom Exception" will be "RuntimeException"
public class IllegalNameException extends RuntimeException{

    public IllegalNameException(String message){
        super(message);
    }

}
