package lesson03.lecture.stack_list;

import java.util.ArrayList;

//stack is a list -> means stack extends from ArrayList
public class Stack<T> extends ArrayList<T> {
    private int stackPointer  = -1;

    public void push(T item){
//        add(item);
        add(++stackPointer,item);
    }
    public T pop(){
        T removeData = remove(stackPointer);
        stackPointer--;
        return removeData;
    }

    @Override
    public void clear() {
        super.clear();
        stackPointer = -1;
    }
}
//push data to stack
//pop data from stack
//stack contains a pointer, which points to the top
//LIFO

class Main{
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(4);
        integerStack.push(3);
        integerStack.push(6);
        System.out.println("Status: "+ integerStack);
        System.out.println("Removed: " + integerStack.pop());
        System.out.println("Status: "+ integerStack);
        integerStack.clear();
        integerStack.push(6);
        System.out.println("Status: "+ integerStack);

    }
}