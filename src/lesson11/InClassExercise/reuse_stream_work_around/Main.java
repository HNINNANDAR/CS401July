package lesson11.InClassExercise.reuse_stream_work_around;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Lionel Messi", "Julián Álvarez", "Enzo Fernández", "Alejandro Garnacho", "Facundo Buonanotte");
        //find names start with E
        findNamesStartWithPrefix(names,"E");
        //later, find names start with J
        findNamesStartWithPrefix(names,"J");


    }
    public static void findNamesStartWithPrefix(List<String> names, String prefix){
        create(names).filter(name -> name.startsWith(prefix)).forEach(System.out::println);
    }
    private static Stream<String> create(List<String> names){
        return names.stream();
    }
}
