import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetImpli {
    public static void main(String args[]){
        Set<Integer> set = new LinkedHashSet<>();
        set.add(6);
        set.add(12);
        set.add(18);
        set.add(24);
        set.add(30);
        set.add(36);

        System.out.println(set);// displaying order will not be the same

        set.remove(10);
        System.out.println(set);
        set.remove(6);
        System.out.println(set);

        System.out.println("Set Contain's this element or not "+set.contains(12));

        System.out.println("Size of this set is :: "+set.size());

        set.clear();
        System.out.println(set);
    }
}
