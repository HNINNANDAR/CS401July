package lesson11.InClassExercise.reuse_stream;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> emp = List.of("a","b","c");
//        another way of creating stream
//        Stream<Integer> stream = Stream.of(1,2,3,4,5);
//        Stream<String> stringStream = Stream.of("a","b","c","d","e");
        Stream<String> stringStream1 = emp.stream();
        Stream<String> mapStream = stringStream1.map(String::toUpperCase);
//        stringStream1.forEach(System.out::println);
        mapStream.forEach(System.out::println);
        stringStream1.forEach(System.out::println);

        //to ask with professor
     }
}