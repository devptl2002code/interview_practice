package oops;

public class Polymorphism {

    // 1. static/ overloading/ compile-time
    static class Addition{
        int add(int a, int b){
            return a + b;
        }

        double add(double a, double b, double c){
            return a + b + c;
        }
    }


    public static void main(String[] args){

        Addition addNumber = new Addition();
        System.out.println("addition of numbers: " + addNumber.add(2,3));
        System.out.println("addition of numbers: " + addNumber.add(2.333, 3.444, 5.001));

    }
}
