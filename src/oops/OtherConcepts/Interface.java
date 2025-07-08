package oops.OtherConcepts;

public class Interface {


    /* before java 8 : only abstract methods are allowed (which contain only method signature)
    * after java 8: with abstract class, default (have implementation) and static methods are introduced
    * after java 9: allowed private methods in interface */


    interface Vehicle {
        void start();
        void stop();
    }

    static class Car implements Vehicle {
        public void start() {
            System.out.println("Car starting...");
        }
        public void stop() {
            System.out.println("Car stopping...");
        }
    }

}
