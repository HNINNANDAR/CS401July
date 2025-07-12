package lesson13.InClassExercise.pre_jdk5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //how list was created before jdk1.5
        //hetrogenous collection
        List list = new ArrayList();
        list.add("one");
        list.add(10);
        list.add(true);
        System.out.println(list);
        //access the first data and keep it in first var
        String first = (String) list.get(0);
        int age = (Integer) list.get(1);//int age = (int) list.get(1);
        boolean isMale = (Boolean) list.get(2);
        System.out.println(first);
    }
}
