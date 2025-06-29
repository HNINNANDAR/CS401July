package Lesson5.Lecture.object_creation_factory_pattern.ext;

import Lesson5.Lecture.object_creation_factory_pattern.studdent_grade_report.StudentGradeReport;
import Lesson5.Lecture.object_creation_factory_pattern.studdent_grade_report.StudentGradeReportFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StudentGradeReport> studentGradeReportList = new ArrayList<>();
        studentGradeReportList.add(StudentGradeReportFactory.createStudentGradeReport("Ei" , "A+"));
        studentGradeReportList.add(StudentGradeReportFactory.createStudentGradeReport("Thae" , "B+"));
        studentGradeReportList.add(StudentGradeReportFactory.createStudentGradeReport("Zaw" , "C+"));
        studentGradeReportList.add(StudentGradeReportFactory.createStudentGradeReport("Zaw" , "A"));


        //sort report based on grade
//        Collections.sort(studentGradeReportList, new Comparator<StudentGradeReport>() {
//            @Override
//            public int compare(StudentGradeReport o1, StudentGradeReport o2) {
//                return 0;
//            }
//        });
        studentGradeReportList.sort(new Comparator<StudentGradeReport>() {
            //grade order -> to come + first
            List<String> gradeOrder = List.of("A+","A","B+","B","C+","C","D+","D");
            @Override
            public int compare(StudentGradeReport o1, StudentGradeReport o2) {
//                return o1.getGradeReport().getGrade().compareTo(o2.getGradeReport().getGrade());
                int index1 = gradeOrder.indexOf(o1.getGradeReport().getGrade());
                int index2 = gradeOrder.indexOf(o2.getGradeReport().getGrade());
                return Integer.compare(index1,index2);
            }
        });
        for(StudentGradeReport studentGradeReport: studentGradeReportList){
            System.out.println("student: " + studentGradeReport.getStdent().getName() + " grade: " + studentGradeReport.getGradeReport().getGrade());
        }
    }
}
