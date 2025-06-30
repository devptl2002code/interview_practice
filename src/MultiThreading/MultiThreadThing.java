package MultiThreading;

// using Thread class
/*public class MultiThreadThing extends Thread {

    private int threadNumber;
    public MultiThreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }


    // override inbuilt method run() of thread class in this class
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " printed for thread : " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}*/

// using Runnable interface
public class MultiThreadThing implements Runnable {

    private int threadNumber;
    public MultiThreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }


    // override inbuilt method run() of thread class in this class
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " printed for thread : " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}