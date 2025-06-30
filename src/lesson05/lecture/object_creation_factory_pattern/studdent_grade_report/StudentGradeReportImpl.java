package lesson05.lecture.object_creation_factory_pattern.studdent_grade_report;

public class StudentGradeReportImpl implements StudentGradeReport{
    private Student student;
    private GradeReport gradeReport;
    public StudentGradeReportImpl(Student student, GradeReport gradeReport) {
        this.student = student;
        this.gradeReport =gradeReport;
    }

    @Override
    public Student getStdent() {
        return student;
    }

    @Override
    public GradeReport getGradeReport() {
        return gradeReport;
    }
}
