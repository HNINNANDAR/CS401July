package lesson02.lab.Lab2.prob2A.ext;

import lesson02.lab.Lab2.prob2A.GradeReport;
import lesson02.lab.Lab2.prob2A.Student;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Nandar");
        GradeReport gradeReport = student.getGradeReport();
        gradeReport.setGrade("A");
        System.out.println(student.getGradeReport());
    }
}
