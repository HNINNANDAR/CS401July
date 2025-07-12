package lesson11.InClassExercise.terminal_operation.terminal_op_optional;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Thae","John", "Jack","Marry");
        names.stream()
                .filter(name -> name.startsWith("J"))
                .findFirst()
                .ifPresent(System.out::println);

        List<String> extractedContent = List.of("Today",",","I","am","going","to","speak","about","murder");
        List<String> sensitiveWords = List.of("hate","violence","murder");

        extractedContent.stream().filter(
                word -> sensitiveWords.contains(word))
                .findFirst()
                        .ifPresent(
                        data -> System.out.println("Alert data (find first): " + data));

        extractedContent.stream().filter(
                        word -> sensitiveWords.contains(word))
                .findFirst()
                .ifPresent(
                        data -> System.out.println("Alert data (find any): " + data));
    }
}
