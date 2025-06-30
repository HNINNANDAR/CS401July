package lesson05.lecture.object_creation_factory_pattern.studdent_grade_report;

 public final class GradeReport {
    private String grade;
    private Student student;

    GradeReport(String grade) {
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }
    void setStudent(Student student){
        this.student = student;
    }
    public Student getStudent() {
        return student;
    }
}
