package lesson05.lecture.object_creation_factory_pattern.studdent_grade_report;

 public class Student {
    private String name;
    private GradeReport gradeReport;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void setGradeReport(GradeReport gradeReport){
        this.gradeReport = gradeReport;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }
}
