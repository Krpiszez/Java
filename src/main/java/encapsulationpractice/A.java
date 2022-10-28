package encapsulationpractice;

public class A {

    private String name = "Omer";
    private int age = 29;
    private boolean isMale = true;

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
