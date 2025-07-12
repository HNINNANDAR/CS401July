package lesson11.InClassExercise.sort_functional_programming;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("John", 30),
                new Student("Marry", 20),
                new Student("Pui", 80),
                new Student("John", 20)
        );
//        Collections.sort(students, Comparator.comparing(s -> s.getName())); //trying to modify immutable list //throw an err
        students.stream()
                .sorted(
                            Comparator.comparing(
                                        (Student s) -> s.getName()).
                            thenComparing(s -> s.getGrade(),Comparator.naturalOrder())
                ).forEach(System.out::println);
        //can this order be applied in any of the comparing or thenComparing??
    }
}
