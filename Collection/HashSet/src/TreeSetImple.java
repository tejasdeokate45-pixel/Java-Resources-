import java.util.Set;
import java.util.TreeSet;
public class TreeSetImple {
    public static void main (String args[]){
        Set<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(30);
        num.add(2);
        num.add(7);
        num.add(1);

        System.out.println(num);
        System.out.println("Removing 12 :: "+num.remove(12));
        System.out.println("Removing 1 :: "+num.remove(1));
        System.out.println(num);

        System.out.println(num.contains(12));
        num.clear();
        System.out.println(num);
    }
}
