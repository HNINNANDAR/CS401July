package lesson12.thread_creation_part1;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    /***
     * It contains thread job
     */
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i +" : "+ Thread.currentThread().getName());
        }
    }
}
