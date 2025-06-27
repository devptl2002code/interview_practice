package oops;

public class Inheritance {

//    1. Inheritance

    public static class Animal{
        void eat(){
            System.out.println("Animal is eating!!");
        }
    }

    public static class Dog extends Animal{
        void sound(){
            System.out.println("Dog is barking!!");
        }
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        dog.eat(); // which method is inherited from parent Animal class
    }
}


/*
* cmd path : cd .\src\oops\
* javac Main.java
* java Main
*
* */
