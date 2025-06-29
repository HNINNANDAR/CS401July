package Lesson4.Labs.payroll_calculation;

public class Hourly extends Employee {
    private double hourlyWage;
    private int housrsPerWeek;

    public Hourly(String empId, double hourlyWage, int housrsPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.housrsPerWeek = housrsPerWeek;
    }

    @Override
    double calcGrossPay(int month, int year) {
        return hourlyWage * housrsPerWeek * 4;
    }
}
