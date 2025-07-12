package lesson11.InClassExercise.terminal_operation.toList_terminal;

import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        //create stream for primitive data - > Int Stream
        IntStream intStream = IntStream.of(1,2,3,4,5,6);
        System.out.println("IntStream Sum: " + intStream.sum());
        //since stream alrdy use it, cannot reuse it
//        System.out.println("IntStream Avg: " + intStream.average());
        intStream = IntStream.range(1,11); // 1 to 10
        System.out.println("IntStream Sum with range: " + intStream.sum());

        intStream = IntStream.rangeClosed(1,10); // 1 to 10
        System.out.println("IntStream summary statistics: " + intStream.summaryStatistics());
    }
}
