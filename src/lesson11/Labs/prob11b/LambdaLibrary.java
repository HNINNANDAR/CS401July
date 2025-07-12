package lesson11.Labs.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
   static TriFunction<List<Employee>, Integer, Character, String> triFunction = (employees, salary, findChar) -> {
       return employees.stream()
               .filter(employee -> employee.getSalary() > salary )
               .filter(employee -> {
                   char c = employee.getLastName().toUpperCase().charAt(0);
                   return c > findChar && c <= 'Z';
               })
               .map(employee -> employee.getFirstName() + " " + employee.getLastName())
               .sorted()
               .collect(Collectors.joining(", "));
   };
}
