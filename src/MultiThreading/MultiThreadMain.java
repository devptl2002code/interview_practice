package MultiThreading;

public class MultiThreadMain {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            MultiThreadThing myThing = new MultiThreadThing(i);
            // myThing.run();
            // it will works,  but there is no sense when there are multiple thread to run , because it run first thread then other,

            // if use Thread class
            // myThing.start();

            // if used runnable interface
            Thread myThread = new Thread(myThing);
            myThread.start();

            // other important methods
            try {
               // myThread.join(); // it wait to die running thread then use other thread
               //  myThread.isAlive(); // to validate thread is running or not
            } catch (Exception e){

            }
        }

    }
}
