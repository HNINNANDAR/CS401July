package lesson10.labs.prob2.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY,BYNAMEANdSALARY};
	
	public void sort(List<Employee> emps, final SortMethod method) {
		class EmployeeComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(method == SortMethod.BYNAME) {
					return e1.name.compareTo(e2.name);
				} else if(method == SortMethod.BYSALARY){
					if(e1.salary == e2.salary) return 0;
					else if(e1.salary < e2.salary) return -1;
					else return 1;
				}else{
					int nameCompare = e1.name.compareTo(e2.name);
					return (nameCompare !=0) ?nameCompare: Double.compare(e1.salary,e2.salary);
				}
			}
		}
		Collections.sort(emps, new EmployeeComparator());
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Joe", 5000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);
		//sort by name and salary
		ei.sort(emps, SortMethod.BYNAMEANdSALARY);
		System.out.println(emps);
	}
}
