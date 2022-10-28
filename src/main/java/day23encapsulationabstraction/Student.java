package day23encapsulationabstraction;

public class Student {

    public String name = "Tom Hanks";
    private String stdId = "TH123";//This is encapsulation. You don't want it to be accessed from outside the class.==> Capsule == class.
    private double stdGpa = 3.8;
    private String disease = "Heart Disease";
    private boolean successful = false;
    public double getStdGpa() {//getStdGpa ==> naming convention
        return stdGpa;         // This is going to private variable and shows it to user.
    }
    public String getStdId() {
        return stdId;
    }
    public String getDisease(){
        return disease;
    }
    public boolean isSuccessful() {//For booleans IntelliJ use "is" instead of "get" while using getter method.
        return successful;
    }
    public void setDisease(String disease) {// Every time set() method return type will be void. Because set() method will do just an action. It will change the data.
        this.disease = disease;
    }
    public void setStdGpa(double stdGpa) {
        this.stdGpa = stdGpa;
    }
    public void setSuccessful(boolean successful) {//Even data type is boolean we use set at the beginning for setter method()
        this.successful = successful;
    }
}
