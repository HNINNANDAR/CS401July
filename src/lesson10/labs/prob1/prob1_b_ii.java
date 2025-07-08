package lesson10.labs.prob1;

import java.util.function.Supplier;

public class prob1_b_ii {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random Number: " + randomSupplier.get());
    }
}
