package lesson11.InClassExercise.terminal_operation.reduce_demo;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("John","Scalet","Marry","");
        String result = names.stream()
                .reduce("",(first, second ) -> first + " " + second);
        System.out.println("Reduce with identity: " + result);

        Optional result1 = names.stream()
                .reduce((first, second ) -> first + " " + second);
        System.out.println("Reduce without identity: " + result1);
    }
}
