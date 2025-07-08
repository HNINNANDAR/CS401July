package lesson11.InClassExercise.functional_programming;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("beautiful","pretty","gorgeous","amazing","wonderful");
        //count words which has length greater than 5
        //1. create a stream obj
        Stream<String> stringStream = words.stream();
        //2. filter words with length greater than 5
        //predicate -> returns true of false
        Stream<String> filterStream = stringStream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 6;
            }
        });
        //3. count
        System.out.println("no of length greater than 6: " + filterStream.count());

        //functional programming
        //stream
//        System.out.println("Lambda => no of length greater than 6: " +
//                words.parallelStream().
//                        filter( s -> {
//                            System.out.println(Thread.currentThread().getName());
//                            return s.length() > 6;
//                        }).count());
        //parallel stream
        System.out.println("Lambda => no of length greater than 6: " +
                words.parallelStream().
                        filter( s -> {
                            System.out.println(Thread.currentThread().getName() + ": " + s);
                            return s.length() > 6;
                        }).count());
        //.filter()
        //.count() -> filter won't invoke until count call filter

        //limit the thread
        ForkJoinPool customThreadPool = new ForkJoinPool(3);

        //Fork Join
        //Divide, Do the proceed and join
    }
}