package lesson10.labs.prob1;

import java.util.function.Supplier;

public class prob1_b_iii {
    public static void main(String[] args) {
        class RandomSupplier implements Supplier<Double>{

            @Override
            public Double get() {
                return Math.random();
            }
        }
        RandomSupplier randomSupplier = new RandomSupplier();
        System.out.println("Random Number: " + randomSupplier.get());
    }
}
