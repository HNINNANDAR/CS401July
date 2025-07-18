package lesson09.labs.prob1.partB;

import java.util.Objects;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return salary == employee.salary && Objects.equals(name, employee.name);
	}

	public boolean equals(Employee e) {
		return e.name.equals(name) && e.salary == salary;
	}
//	public boolean equals(Object ob) {
//		Employee e = (Employee)ob;
//		return e.name.equals(name) && e.salary == salary;
//	}

}
