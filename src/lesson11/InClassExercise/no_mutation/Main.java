package lesson11.InClassExercise.no_mutation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //immutable
        List<String> names = List.of("Tom","John","Merry","James","Jerr");
        //get a list of names in upper case
        //without using stream API
        names.forEach(
                name -> System.out.println(name)
        );
        names.stream().
                map(data -> data.toUpperCase())
                .forEach(System.out::println);
        System.out.println(names);

        //filter names with letter start 'N' and convert it to upper case
        System.out.println("Name starts with J: ");
        names.stream()
                .filter(name -> name.startsWith("J")) //intermediate operation
                    .peek(data -> System.out.println("Peeked after filter: " + data))
                .limit(1)
                .map(name -> name.toUpperCase()) //intermediate operation
                    .peek(data -> System.out.println("Peeked after map: " + data))
                .forEach(System.out::println); //terminal operation
    }
}
