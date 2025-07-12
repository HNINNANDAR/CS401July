package lesson11.InClassExercise.infinite_stream;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {
    static int sum = 0;
    static int sum1 = 0;
    public static void main(String[] args) {
        Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).limit(10)
                .forEach(System.out::println);

        //without using supplier
        Stream.generate(() -> Math.random())
                .limit(10)
                .forEach(System.out::println);

        //another way to create infinite stream
        Stream.iterate(23.10, new UnaryOperator<Double>() {
            //having one input
            //if BinaryOperator, there's going tio hv two parameter in apply
            @Override
            public Double apply(Double aDouble) {
                double sum = aDouble + Math.random();
                System.out.println("In apply: " + aDouble +" + sum: " + sum);
                return sum;
            }
        }).limit(10)
                .forEach(System.out::println);

        Stream.iterate(21.09, aDouble ->
            aDouble + Math.random())
                .limit(5)
                .forEach(System.out::println);

        //seed -> initial val
        //seed type is the input type as well as return type
        System.out.println("Find the sum of n number: ");
        Stream.iterate(0, a -> {
                    a = a + 1;
                    sum1 += a;
                    return sum1;
        }).limit(10)
                .forEach(System.out::println); //to put the sum here
        System.out.println("Total Sum1: " + sum1);

        Stream.iterate(0, n -> n < 10, n -> n + 1 )
                .forEach(data -> sum += data);
        System.out.println("Total Sum: " + sum
        );
    }
}
class Employee{

}
