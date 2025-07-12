package lesson13.InClassExercise.find_max;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static <T extends Comparable<T>> T findMax(List<? extends T> list){
        //    static <T extends Comparable<? super T>> T findMax(List<T> list){
        //    static <T extends Comparable<T>> T findMax(List<? extends T> list){
        //     static <T extends Comparable<T>> T findMax(List<T> list){
        T max = list.getFirst();
        for(T i : list){
            if(i.compareTo(max) > 0) //i is greater than max
                max = i;
            //OR
//            if(max < i) //cannot perform any mathematical operation nor relational operation
//                max = i;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(findMax(List.of(1,2,3,4,5)));
        System.out.println(findMax(List.of(1.2,4.3,2.1,5.5)));
        System.out.println(findMax(List.of("one","two","three","four","five")));
//        System.out.println(findMax(List.of(4,2.0))); //compare two obj, it should be the same type
        System.out.println(findMax(List.of(4.2,2.0)));
        List<LocalDate> localDates =
                List.of(LocalDate.of(2025,7,1),
                LocalDate.of(2025,7,3),
                LocalDate.of(2025,4,5),
                LocalDate.of(2025,5,6));
        System.out.println(findMax(localDates)); //superclass of LocalDate has Comparable, not LocalDate itself
        System.out.println(findMax(
                List.of(LocalDate.of(2025,7,1),
                LocalDate.of(2025,7,3),
                LocalDate.of(2025,4,5),
                LocalDate.of(2025,5,6))));
    }
}
