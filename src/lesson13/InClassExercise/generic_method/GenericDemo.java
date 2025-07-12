package lesson13.InClassExercise.generic_method;

import java.util.List;

public class GenericDemo {
    //...data and methods
    static <T> void print(T[] arr){
        for(T t : arr){
            System.out.println(t);
        }
    }
    //scope of type var, T is only for the particular method
    public static <T> void printList(List<T> list){
        for(T t : list){
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        print(new Integer[]{1,2,3});
        print(new Double[]{1.2,3.1,2.4});

        printList(List.of(1,2,3));
        printList(List.of("one","two","three"));
    }
}
