package lesson12.thread_creation_part1;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("first"); // thread is born (new thread created)
        //change this new born to ready to run state OR Runnable state
        MyThread myThread1 = new MyThread("second"); // thread is born (new thread created)

        myThread.start();
        myThread1.start();
        //JVM automatically creates main thread
        for(int i = 0; i < 5; i++){
            System.out.println(i +" : "+ Thread.currentThread().getName());
        }
    }
}
