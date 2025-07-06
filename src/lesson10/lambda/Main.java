package lesson10.lambda;

public class Main {
    public static void main(String[] args) {
        //new anonymous class which implements AddIntf
        AddIntf obj = new AddIntf(){
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        AddIntf obj1 = (a, b) -> a + b; //lambda
        AddIntf obj2 = (a,b) -> {
            return a +b ;
        };

        System.out.println(obj.add(1,2));
        System.out.println(obj1.add(4,5));
        System.out.println(obj2.add(4,4));
    }
}
