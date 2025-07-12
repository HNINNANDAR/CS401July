package final_exam.prob6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Skoda", 18544),
                new Car("Volvo", 22344),
                new Car("Fiat", 23650),
                new Car("Renault", 19700),
                new Car("Volvo", 24500),
                new Car("Fiat", 21700),
                new Car("Renault", 19600),
                new Car("Volvo", 18650),
                new Car("Fiat", 19800)
        );
        cars.stream()
                .reduce((a,b) -> a.getPrice() < b.getPrice()? a: b)
                .map( car -> "Car{brand='" + car.getBrand()+ "', price="+ car.getPrice()+"}")
                .ifPresent(System.out::println);

    }
}
