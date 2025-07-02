package lesson04.sequence_diagram_exercis.Company;

public class Position {
    private String title;
    private String description;
    private Employee employee;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void addEmployee(Employee employee){
        if(this.employee == null)
            this.employee = employee;
    }
    public double getSalary(){
        if(this.employee != null)
         return this.employee.getSalary();
        return 0;
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", employee=" + employee +
                '}';
    }
}
