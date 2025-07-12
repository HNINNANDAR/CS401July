package lesson11.InClassExercise.stream_to_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Alia","Berry","Clint");//immutable
        Stream<String> stream = list.stream();//mutable
        //covert to arr
        String[] s = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(s));

    }
}
