package oops.OtherConcepts;

public class Abstract {

// Abstract methods can have
//    Abstract methods (without implementation)
//    Concrete methods (with implementation)
//    Constructors
//    Fields (instance variables)



    abstract static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        abstract void makeSound();  // abstract method

        void sleep() {              // concrete method
            System.out.println(name + " is sleeping.");
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        void makeSound() {
            System.out.println(name + " says: Woof!");
        }
    }


}
