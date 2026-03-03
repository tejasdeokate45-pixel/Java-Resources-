package org.cfs;

public class Student {
    Course course;

    void start(){
        course.enroll();
    }

    public Student(Course course) {
        this.course = course;
        course.enroll();
    }
}
