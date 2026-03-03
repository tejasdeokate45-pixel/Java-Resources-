package StreamApi;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamObject {
    public static void main(String args[]){

        // 1.  creating a Empty Stream
        Stream<Integer> emptStream = Stream.empty();

        System.out.println(emptStream);

        // 2. cretaing using an array
        int arr[] = {1,23,3,4,5,6,7};
        Stream<Integer> arrOfStream = Arrays.stream(arr).boxed();// Integer-> int
        arrOfStream.forEach(i-> System.out.print(" "+i) );
        System.out.println();


        String names[] = {"Tejas","Aastha","Suresh","Mukesh"};
        Stream<String> strOfNames = Stream.of(names);
//        System.out.println(strOfNames); not a valid syntax
        strOfNames.forEach(i-> System.out.println(i));


        // 3. Using Arrays

        Stream<Integer> arrStream = Arrays.stream(new Integer[]{1,2,3,4,5});
        arrStream.forEach(i->System.out.println(i));

        // 4. Creating Stream using collection framework

        List<Float> arrlist = new ArrayList<>();
        arrlist.add(1.01f);
        arrlist.add(3.01f);
        arrlist.add(90.01f);
        arrlist.add(89.01f);
        arrlist.add(90.01f);
        arrlist.add(34.01f);
        arrlist.add(561.01f);

        arrlist.stream().filter(i->i>78).forEach(i->System.out.println("Greater than 78 :: "+i));
        List<Float> ans=arrlist.stream().filter(i-> i>30).toList();
        System.out.println("Greater than 30 :: Element ");
        System.out.println(ans);




    }
}
