package PRACTICESESSIONS;

public class Day06Q03CalculateVolumeOfCube {

    //Create a method to calculate volume of cube, square prism and rectangular prism.



    public double volumeOfCube(double a){
        return a*a*a;
    }

    public static double volumeOfSquarePrism(double a, double b){
        return a*a*b;
    }

    public static double volumeOfRectangularPrism(double a, double b, double c){
        return a*b*c;
    }

    public static double totalPrice(double a, double... prices){
        int sum = 0;

        for (double w: prices){
            sum += w;
        }
        return a+sum;
    }
}
