package lesson11.InClassExercise.diff_ways_create_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //if a list is given, we can create a stream
        List<Integer> integers = List.of(1,2,3,4,5,6,7);
        Stream<Integer> integerStream = integers.stream();

        //if an array of Integer
        Integer[] integers1 = {1,2,3,4,5,6};
        //... means variable arguments, arguments can be more than more
        Stream<Integer> integerStream1 = Stream.of(integers1);

        Employee[] employees = {
                new Employee(),
                new Employee()
        };
        Stream<Employee> employeeStream = Stream.of(employees);
        int[] ints = {1,2,3,4,5,6};
        //Int stream and DoubleStream are special stream designed for primitive data, int and double
        IntStream intStream = Arrays.stream(ints);
        IntStream intStream1 = IntStream.of(10,20,30,40); //create stream for primitive data type
        DoubleStream doubleStream = DoubleStream.of(2.3,4.8,12.1);

    }
}
class Employee{

}
