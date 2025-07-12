package lesson11.InClassExercise.terminal_operation.min_max;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,5,6,6,7,8);
        System.out.println(intStream.min());
//        System.out.println(intStream.max());
        System.out.println(
               "Sum: " + IntStream.range(1,11).sum()
        );
        System.out.println(
                "Min: " + IntStream.range(1,11).min()
        );
        System.out.println(
                "Max: " + IntStream.range(1,11).max()
        );
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                integers.stream()
                        .mapToInt(Integer::intValue)
                        .sum()
        );
        //min
        integers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        OptionalInt minned = integers.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("MIN: " + minned.getAsInt());

        //max
        integers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);
        //avg
        integers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);

        List<String> words = List.of("life","great","woderful");
        words.stream()
                .mapToInt(String::length)
                .min()
                .ifPresent(System.out::println);
    }
}
