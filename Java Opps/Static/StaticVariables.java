public class StaticVariables{
    public static void main(String args[]){
        Student s = new Student();
        s.name="Tejas";
        s.roll=21;
        s.SchoolName="St francis";
        System.out.println(s.name);

        Student s1 = new Student();
        s1.name="Kunal";
        s1.roll=16;

        System.out.println(s1.SchoolName);// but we didnt initialized school name for s1 object still it get the name 
    }
}

class Student{
    int roll;
    String name;
    static String SchoolName;
}