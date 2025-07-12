package final_exam.prob1and2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> foods = List.of(
                "Grits",
                "Pancakes",
                "Burrito",
                "Bacon & Eggs",
                "Greek Salad",
                "Caesar Salad",
                "Sandwich"
        );
        Map<String, Integer> calorieMap = Map.of(
                "Grits", 150,
                "Pancakes", 350,
                "Burrito", 400,
                "Bacon & Eggs", 300,
                "Greek Salad", 200,
                "Caesar Salad", 250,
                "Sandwich", 330
        );



        List<Integer> caloriesCount = foods.stream()
                .filter(food -> !food.toLowerCase().contains("salad"))
                .map(calorieMap::get)
                .sorted()
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(caloriesCount);

                calorieMap.entrySet().stream()
                        .filter(calorie -> calorie.getKey().toLowerCase().contains("salad") && calorie.getValue() > 200)
                        .forEach(entry -> System.out.println(entry.getKey()+": " + entry.getValue()));


    }
}
