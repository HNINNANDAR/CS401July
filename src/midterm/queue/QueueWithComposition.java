package midterm.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QueueWithComposition<T> {
    List<T> list = new ArrayList<>();
    public void enqueue(T str){
        list.add(str);
    }
    public T deque(){
        if(list.isEmpty()) throw new NoSuchElementException("List is empty.");
        return list.remove(0);
    }
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
