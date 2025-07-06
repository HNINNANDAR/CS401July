package lesson09.InClass.interface_flexibility.test;

public class MyClassImpl extends SuperClass implements I1{
    public void test(){
        I1.super.fun();
    }
}
