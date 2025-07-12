package lesson11.Labs.prob3;

import java.util.stream.Stream;

public class Prob3A {
    static public boolean isPrime(int n){
        if(n <= 1 ) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    static Stream<Integer> primes = Stream.iterate(
            2, n1 -> {
                int next = n1 + 1;
                while(!isPrime(next)){
                    next++;
                }
                return next;
            })
            .limit(5); //limit to get 5 prime numbers

    public static void main(String[] args) {
        primes.forEach(System.out::println);
    }
}
