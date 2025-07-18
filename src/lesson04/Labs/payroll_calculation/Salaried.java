package lesson04.Labs.payroll_calculation;

public class Salaried extends Employee {
    private double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    double calcGrossPay(int month, int year) {
        return salary;
    }
}
