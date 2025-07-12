package lesson11.InClassExercise.flat_map.model.application;


import lesson11.InClassExercise.flat_map.model.Course;
import lesson11.InClassExercise.flat_map.model.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("101","Thae");
        s1.addCourse("CS401","MPP");
        s1.addCourse("CS402","FPP");

        Student s2 = new Student("102","Nandar");
        s1.addCourse("CS403","MPP1");
        s1.addCourse("CS404","MPP1");

        Student s3 = new Student("103","Zaw");
        s1.addCourse("CS405","MPP3");
        s1.addCourse("CS406","MPP2");

        List<Student> students = List.of(s1,s2,s3);

//        Stream<List<Course>> stream = students.stream()
//                .map(student -> student.getCourses()); //getting 3

        Stream<Course> stream = students.stream()
        .flatMap(student -> student.getCourses().stream());
        System.out.println(stream.count());

    }
}
