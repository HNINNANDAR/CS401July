package lesson10.labs.prob2.A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int nameCompare = e1.name.compareTo(e2.name);
		if(nameCompare != 0) return nameCompare;
		return Double.compare(e1.salary,e2.salary);
	}
}
