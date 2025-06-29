package Lesson5.Lecture.object_creation_factory_pattern.factory_method;

public class Employee {
    private String employeeId;
    private String name;
    private String email;
    private String phoneNum;
    private String message;

//    public Employee(String employeeId, String name, String email) {
//        this.employeeId = employeeId;
//        this.name = name;
//        this.email = email;
//    }
//
//    public Employee(String employeeId, String name, String phoneNum) {
//        this.employeeId = employeeId;
//        this.name = name;
//        this.phoneNum = phoneNum;
//    }
    public static Employee createEmployeForEmail(String employeeId, String name, String email) {
        Employee employee = new Employee();
        return employee;
    }
    public static Employee createEmployeForSMS(String employeeId, String name, String phoneNum) {
        Employee employee = new Employee();
        return employee;
    }

}
