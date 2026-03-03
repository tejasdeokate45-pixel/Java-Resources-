package org.example;

public class Student {
    private Course course;

    public Student(){

    }

    public Student(Course course){
        this.course=course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void start(){
        course.subject();
    }
}
