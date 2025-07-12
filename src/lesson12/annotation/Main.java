package lesson12.annotation;

public class Main {
    public static void main(String[] args) {
        //whether annotation is present for Badcode class
        if(BadCode.class.isAnnotationPresent(BugReport.class)){
            BugReport bugReport = BadCode.class.getAnnotation(BugReport.class);
            System.out.println("Assigned to: " + bugReport.assignedTo());
            System.out.println("Severity: " + bugReport.severity());
        }

    }
}
