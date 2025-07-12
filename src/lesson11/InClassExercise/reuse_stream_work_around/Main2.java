package lesson11.InClassExercise.reuse_stream_work_around;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = List.of("Lionel Messi", "Julián Álvarez", "Enzo Fernández", "Alejandro Garnacho", "Facundo Buonanotte");
        BiFunction<List<String>, String, Stream<String>> biFunction = (list, prefix) -> {
            return list.stream().filter(name -> name.startsWith(prefix));
        };
        biFunction.apply(names,"E").forEach(System.out::println);
        biFunction.apply(names,"J").forEach(System.out::println);
    }
}
