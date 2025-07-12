package lesson11.Labs.prob9;

import java.util.stream.IntStream;

public class prob9 {
    public static void printSquares(int num){
        IntStream.iterate(1,n -> n <= num, n -> n +1)
                .forEach(n -> System.out.println(n * n));
    }

    public static void main(String[] args) {
        printSquares(4);
    }
}

