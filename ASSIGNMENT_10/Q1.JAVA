/*0.1 Write a java program to create a multithreaded program by implementing Runnable interface and
then create, initialize, and start two Thread objects from your class. The threads will execute concurrently
and display “Java is Hot, Java is Simple”, and “Java is Multithreaded” to the console window.  */


class MyThread implements Runnable {

    String message;

    MyThread(String msg) {
        message = msg;
    }

    public void run() {
        System.out.println(message);
    }
}

public class Q1 {
    public static void main(String[] args) {

        // Create Runnable objects: 
        MyThread t1 = new MyThread("Java is Hot, Java is Simple");
        MyThread t2 = new MyThread("Java is Multithreaded");

        // Create Thread objects:
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        // Start the threads...lessgoo
        thread1.start();
        thread2.start();
    }
}
