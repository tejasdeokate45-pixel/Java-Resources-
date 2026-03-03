import java.util.Map;
import java.util.HashMap;
public class HashMapImple {
    public static void main(String args[]){
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Tejas");
        student.put(2,"Sahil");
        student.put(3,"Arutesh");
        student.put(4,"Pritam");
        student.put(1,"Tarun");// key same value get updated now

        System.out.println(student.putIfAbsent(5,"Mayur"));
        System.out.println(student.putIfAbsent(2,"Mayur"));// Sahil is already there
        

        System.out.println(student);

        for(Integer value :student.keySet()){
            System.out.println(value);
        }
        for(String value :student.values()){
            System.out.println(value);
        }
    }
}
