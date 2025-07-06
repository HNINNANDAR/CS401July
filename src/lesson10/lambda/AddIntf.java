package lesson10.lambda;

@FunctionalInterface
public interface AddIntf {
    int add(int a, int b);
//    int subtract(int a, int b); //code braks, as this is declared as functional interface
    //it should only hv one abstract method
    default void print(){

    }// default ignores
    private void f1(){} // private ignores
    public String toString(); // methods from super class ignores
    static void f2(){} //static ignores

}
