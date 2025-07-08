package lesson10.labs.prob2.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY,BYNAMEANdSALARY};
	
	public void sort(List<Employee> emps, final SortMethod method) {
		Comparator<Employee> comparator;
		switch (method){
			case BYNAME :
				comparator = Comparator.comparing(e -> e.name);
				break;
			case BYSALARY:
				comparator = Comparator.comparingDouble( e -> e.salary);
				break;
			case BYNAMEANdSALARY:
				comparator = Comparator.comparing( (Employee e ) -> e.name).thenComparingDouble(e->e.salary);
				break;
			default:
				throw new IllegalArgumentException("Unknow method!");
		}
		Collections.sort(emps, comparator);
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
