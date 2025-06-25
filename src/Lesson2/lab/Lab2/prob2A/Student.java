package Lesson2.lab.Lab2.prob2A;

public class Student {
    private String name;
    private GradeReport gradeReport;
    public Student(String name){
        this.name = name;
        this.gradeReport = new GradeReport(this);
    }
    public GradeReport getGradeReport(){
        return gradeReport;
    }
    public String getName(){
        return name;
    }
}
