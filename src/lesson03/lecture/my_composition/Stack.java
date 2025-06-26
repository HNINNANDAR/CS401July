package lesson03.lecture.my_composition;

import java.util.ArrayList;
import java.util.List;

//this is composition
public class Stack<T>{
    private List<T> list = new ArrayList<>();
    private int stackPointer = -1;

    public void pushItem(T e){
        list.add(++stackPointer,e);
    }
}
class Main{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.pushItem(1);
        stack.pushItem(5);
        stack.pushItem(7);

    }
}
