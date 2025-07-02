package lesson04.sequence_diagram_exercis.Company.ext;

import lesson04.sequence_diagram_exercis.Company.Company;
import lesson04.sequence_diagram_exercis.Company.Department;
import lesson04.sequence_diagram_exercis.Company.Employee;
import lesson04.sequence_diagram_exercis.Company.Position;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("ABC Company");
        Department department = new Department("Compro","ABC Building, 2000 N ");
        Department department1 = new Department("XYZ","ABC Building, 2000 N ");
        Position position = new Position("OA","OA desc");
        Position position1 = new Position("QA","QA desc");
        Position position2 = new Position("Dev","Dev desc");
        Employee employee = new Employee("Nandar", 30000);
        Employee employee1 = new Employee("Zaw", 50000);
        Employee employee2 = new Employee("Thae", 50000);

        company.addDepartment(department);
        company.addDepartment(department1);

        department1.addPositions(position);
        department.addPositions(position1);
        department1.addPositions(position2);

        position1.addEmployee(employee);
        position2.addEmployee(employee2);
        position.addEmployee(employee1);

        double totalSalary = company.totalSalary();

        System.out.println(totalSalary);

    }
}
