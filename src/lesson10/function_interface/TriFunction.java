package lesson10.function_interface;

public interface TriFunction<A, B, C, Void>{
    void apply(A a, B b, C c); //can use own method
}
