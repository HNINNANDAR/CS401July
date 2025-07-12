package lesson11.InClassExercise.filter_null_value;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Tom",null, "Cherry"};
        Arrays.stream(names)
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Arrays.stream(names)
                .map(data -> Optional.ofNullable(data).orElse("EMPTY"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }
}
