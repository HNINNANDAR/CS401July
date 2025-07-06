package lesson09.InClass.interface_flexibility.test;

public interface I1 {
    default void fun(){
        System.out.println("Interface fun");
    }
//    default static void fun1(){
//        System.out.println("Static Interface fun");
//    }
}
//interface  I2{
//    default void fun(){};
//}
//abstract class A implements I1,I2{
//    @Override
//    public abstract void fun();
//
////    public void fun(int a){}
//}
