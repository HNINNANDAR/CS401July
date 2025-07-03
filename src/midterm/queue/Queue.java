package midterm.queue;

import java.util.ArrayList;

class Queue<T> extends ArrayList<T> {
    private int front = 0;
    private int rear = 0;
    public void enqueue(T item) {
        add(rear++, item);
    }
    public T dequeue() {
        return remove(front++);
    }

}

