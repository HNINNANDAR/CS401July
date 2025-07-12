package lesson13.InClassExercise.generic_class;

public class Box <T, U> {
    private T data;
    private U data2;

//    public Box(T data) {
//        this.data = data;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }

    public Box(T data, U data2) {
        this.data = data;
        this.data2 = data2;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public U getData2() {
        return data2;
    }

    public void setData2(U data2) {
        this.data2 = data2;
    }
}
//type is T, which is generic

class Main{
    public static void main(String[] args) {
        Box<Integer, String> box1 = new Box(10,"TT"); //raw type //not int type, returns obj type
        System.out.println(box1.getData() + " " + box1.getData2());

        Box<String, Double> box2 = new Box<>("Nandar",89.99); //<> is a syntax
        System.out.println(box2.getData());
    }
}
