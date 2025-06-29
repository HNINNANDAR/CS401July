package Lesson4.sequence_diagram_exercis.Company;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private String location;
    private List<Position> positions;

    public Department(String departmentName, String location) {
        this.departmentName = departmentName;
        this.location = location;
        this.positions = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void addPositions(Position position) {
        if(position != null)
         this.positions.add(position);
    }
    public double getSalary(){
        double totalSalary = 0;
        for(Position position: positions){
            totalSalary += position.getSalary();
        }
        return totalSalary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", location='" + location + '\'' +
                ", positions=" + positions +
                '}';
    }
}
