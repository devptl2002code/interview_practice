package oops;

public class Abstraction {

//    1. Using Abstract method

    public static abstract class Animal {

        //        concrete method (contain method body also)
        void eat() {
            System.out.println("Animal is eating!");
        }

        //        abstract method
        abstract void sound(); // which implements in subclass
    }

    public static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog is barking");
        }
    }


    //    2. Using Interface method
    interface Math {
        int calculate(int a, int b);
    }

    static class addition implements Math {

        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    }


    static class subtraction implements Math {

        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    }


    public static void main(String[] args) {

//        1. Abstract Method
        Animal dog = new Dog();
        dog.eat();
        dog.sound();

//        2. Interface Method
        int a = 10;
        int b = 5;

        Math add = new addition();
        System.out.println("Addition of tow number of " + a  + " and " + b + " : " + add.calculate(a,b));

        Math sub = new subtraction();
        sub.calculate(9, 2);
        System.out.println("Subtraction of tow number of " + a  + " and " + b + " : " + sub.calculate(a,b));


    }
}
