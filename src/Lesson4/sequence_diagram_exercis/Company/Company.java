package Lesson4.sequence_diagram_exercis.Company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public List<Department> getDepartments() {
        return departments;
    }
    public void addDepartment(Department department) {
        this.departments.add(department);
    }
    public double totalSalary(){
        double totalSalary =0.0;
        for (Department department: departments)
            totalSalary += department.getSalary();
        return totalSalary;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
