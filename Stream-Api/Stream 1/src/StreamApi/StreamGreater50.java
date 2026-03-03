package StreamApi;
import java.util.*;
import java.util.stream.Collectors;


public class StreamGreater50 {
    public static void main(String args[]){
        List<Integer> list = List.of(20,89,90,78,56,45,45,30,98,71,91,93,90,90,909,909,909);

        // Using Stream -> sending greater than 50 elemnt in new List

        List<Integer> Gerater50 = list.stream().filter(i->i>50).collect(Collectors.toList());
        Gerater50.add(12);
        System.out.println("Elemnt lIst Gretaer than 50 "+Gerater50);
    }
}
