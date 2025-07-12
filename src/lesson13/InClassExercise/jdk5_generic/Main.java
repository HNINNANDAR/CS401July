package lesson13.InClassExercise.jdk5_generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        //integer can accept subclass as well
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        System.out.println(integerList);
        int firstData = integerList.get(0);
    }
}
