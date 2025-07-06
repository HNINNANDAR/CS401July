package lesson10.functional_interface;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ListInfo listInfo = new ListInfo();
        listInfo.addNumber(10);
        listInfo.addNumber(33);
        listInfo.addNumber(88);
        for(int i = 0; i < listInfo.getSize(); i++){
//            System.out.println(listInfo.g);
        }
        List<Integer> integers = listInfo.getList();
        System.out.println(integers);

        //consumer obj is behaving like a func
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        integers.forEach(System.out::println); //background , the job is done with Consumer
        //lamda exp

        //Apply lambda for func interface
        Consumer<Integer> consumer = (integer) -> System.out.println(integer);
        Consumer consumer1 = (integer) -> System.out.println(integer);
        integers.forEach(consumer1);
        integers.forEach(consumer);

    }
}
