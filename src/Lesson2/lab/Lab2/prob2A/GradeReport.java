package Lesson2.lab.Lab2.prob2A;

public class GradeReport {
    Student student;
    String grade;
    GradeReport(Student student){
        this.student = student;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "student=" + student.getName()+
                ", grade='" + grade + '\'' +
                '}';
    }
}
