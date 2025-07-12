package lesson13.InClassExercise.wildcard_boundless;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void copyFirstToEnd(List<?> genericList){
        //remove the wildcard
//        genericList.add(genericList.get(0));
        //genericList.get(0) -> gets ?
        //cannot add this unknown type to the list
        //since compiler can't guarantee type safety
        //this is a way to make a type safe, by converting wildcard(?) to concrete type T
        copyFirstToEndHelper(genericList);
    }
    private static  <T> void copyFirstToEndHelper(List<T> list){
        list.add(list.get(0));

    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        copyFirstToEnd(integerList);
    }
}
