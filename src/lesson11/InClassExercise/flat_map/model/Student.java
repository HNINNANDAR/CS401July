package lesson11.InClassExercise.flat_map.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String regNo;
    private  String name;
    private List<Course> courses;

    public Student(String regNo, String name) {
        this.regNo = regNo;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseCode, String courseName) {
        this.courses.add(new Course(courseCode, courseName));
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo='" + regNo + '\'' +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
