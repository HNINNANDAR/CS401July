package Lesson5.Labs.prob4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double total_balance_employee = 0.0;
		for(Employee employee: list){
			total_balance_employee += employee.computeUpdatedBalanceSum();
		}
		return total_balance_employee;
	}
}
