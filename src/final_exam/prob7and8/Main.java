package final_exam.prob7and8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Carrot");
        linkedSet.add("Broccoli");
        linkedSet.add("Spinach");
        linkedSet.add("Tomato");

        linkedSet.stream()
                .reduce((first,second)-> second)
                .ifPresent(System.out::println);

        //prob 8
        List<Car> cars = Arrays.asList(
                new Car("Volvo", "XC40", 25000, 2020),
                new Car("Fiat", "500", 18000, 2022),
                new Car("Volvo", "XC60", 35000, 2022),
                new Car("Skoda", "Octavia", 22000, 2021),
                new Car("Fiat", "Panda", 15000, 2021),
                new Car("Renault", "Clio", 17000, 2020),
                new Car("Volvo", "XC40", 27000, 2022),
                new Car("Skoda", "Fabia", 17500, 2022)
        );
        cars.stream()
                .sorted(Comparator.comparing(
                               Car::getBrand)
                        .thenComparing(Car::getModel)
                        .thenComparing(Car::getPrice,Comparator.reverseOrder())
                        .thenComparing(Car::getYear))
                .forEach(System.out::println);

    }
}
