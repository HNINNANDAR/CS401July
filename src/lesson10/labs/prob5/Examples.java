package lesson10.labs.prob5;

import java.util.function.*;

class Employee {
	private String name;
	public Employee(String name) { this.name = name; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}

class Apple {
	private double weight;
	public Apple(double weight) { this.weight = weight; }
	public double getWeight() { return weight; }
}

class EmployeeNameComparator {
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

public class Examples {
	Function<Employee, String> getName1 = (Employee e) -> e.getName();
	Function<Employee, String> getName2 = Employee::getName; // Type: Class::instanceMethod

	BiConsumer<Employee, String> setName1 = (e, s) -> e.setName(s);
	BiConsumer<Employee, String> setName2 = Employee::setName; // Type: Class::instanceMethod

	BiFunction<String, String, Integer> compare1 = (s1, s2) -> s1.compareTo(s2);
	BiFunction<String, String, Integer> compare2 = String::compareTo; // Type: Class::instanceMethod

	BiFunction<Integer, Integer, Double> pow1 = (x, y) -> Math.pow(x, y);
	BiFunction<Integer, Integer, Double> pow2 = Math::pow; // Type: Class::staticMethod

	Function<Apple, Double> weight1 = (Apple a) -> a.getWeight();
	Function<Apple, Double> weight2 = Apple::getWeight; // Type: Class::instanceMethod

	Function<String, Integer> parse1 = (x) -> Integer.parseInt(x);
	Function<String, Integer> parse2 = Integer::parseInt; // Type: Class::staticMethod

	EmployeeNameComparator comp = new EmployeeNameComparator();
	BiFunction<Employee, Employee, Integer> empCompare1 = (e1, e2) -> comp.compare(e1, e2);
	BiFunction<Employee, Employee, Integer> empCompare2 = comp::compare; // Type: object::instanceMethod

	void evaluator() {
		System.out.println("A. getName: " + getName2.apply(new Employee("Alice")));

		Employee emp = new Employee("Bob");
		setName2.accept(emp, "Charlie");
		System.out.println("B. setName: " + emp.getName());

		System.out.println("C. compare: " + compare2.apply("hello", "world"));
		System.out.println("D. pow: " + pow2.apply(2, 3));
		System.out.println("E. getWeight: " + weight2.apply(new Apple(1.5)));
		System.out.println("F. parseInt: " + parse2.apply("123"));

		Employee e1 = new Employee("Anna");
		Employee e2 = new Employee("Zara");
		System.out.println("G. empCompare: " + empCompare2.apply(e1, e2));
	}

	public static void main(String[] args) {
		new Examples().evaluator();
	}
}
