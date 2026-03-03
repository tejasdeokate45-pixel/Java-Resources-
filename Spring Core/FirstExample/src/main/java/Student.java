public class Student {

    Course course;

    Student(){}
    Student(Course course){
        this.course = course;
    }

    void study(){
        course.start();
    }
}
