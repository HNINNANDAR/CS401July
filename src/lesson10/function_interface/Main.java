package lesson10.function_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,Integer> function = integer -> integer * 2 ;
        System.out.println(function.apply(2));

        BiFunction<Integer,Integer,Integer> biFunction = (integer, integer1) -> integer * (integer1 + 2) ;
        System.out.println(biFunction.apply(2,3));

        BiFunction<Integer,Boolean,String> biFunction1 = (integer, bool1) -> bool1 + " " + integer ;
        System.out.println(biFunction1.apply(2,false));

        TriFunction<Integer, String, Boolean, String> triFunction = ((integer, s, aBoolean) -> System.out.println(integer));
    }
}
