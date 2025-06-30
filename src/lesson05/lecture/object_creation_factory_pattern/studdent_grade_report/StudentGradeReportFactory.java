package lesson05.lecture.object_creation_factory_pattern.studdent_grade_report;

public class StudentGradeReportFactory {

    public static StudentGradeReport createStudentGradeReport(String name, String grade) {
        Student student = new Student(name);
        GradeReport gradeReport = new GradeReport(grade);
        student.setGradeReport(gradeReport);
        gradeReport.setStudent(student);

        return new StudentGradeReportImpl(student,gradeReport);
    }
}
