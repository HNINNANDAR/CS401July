package lesson11.Labs.prob3;

import java.util.stream.Stream;

public class Prob3B {
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
class PrimeStream {
    public boolean isPrime(int n){
        return Prob3A.isPrime(n);
    }
    public void printFirstNPrimes(int n) {
        final Stream<Integer> primes = Stream.iterate(
                 2, n1 -> {
                    int next = n1 + 1;
                    while(!isPrime(next)){
                        next++;
                    }
                    return next;
                })
                .limit(n);
        primes.forEach(System.out::println);

    }

}