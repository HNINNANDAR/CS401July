package midterm.queue.ext;

import midterm.queue.QueueWithComposition;

public class Main {

    public static void main(String[] args) {
        QueueWithComposition<String> queue = new QueueWithComposition<>();
        queue.enqueue("A");
        queue.deque();
        System.out.println(queue.size());
    }
}
