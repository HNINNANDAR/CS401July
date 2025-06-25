package Lesson2.lab.Lab2.prob2A.ext;

import Lesson2.lab.Lab2.prob2A.GradeReport;
import Lesson2.lab.Lab2.prob2A.Student;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Nandar");
        GradeReport gradeReport = student.getGradeReport();
        gradeReport.setGrade("A");
        System.out.println(student.getGradeReport());
    }
}
