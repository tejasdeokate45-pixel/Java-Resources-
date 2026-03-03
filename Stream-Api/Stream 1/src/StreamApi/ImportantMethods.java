package StreamApi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImportantMethods {
    public static void main(String args[]){
        List<Integer>  list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);

        // using filter;

        Stream<Integer> str = list.stream();
        List<Integer>newStr=str.filter(i->i>2).collect(Collectors.toList());
        newStr.forEach(i->System.out.print(i+" "));

        // multiply each elemnt of the arraylist with 10 and and then divide same with 10 and stoire it in list


        System.out.print("List element multiplied by 10 then deiveide by 10 means X0.5 of each element ::");
        Stream<Integer> tenStream = list.stream();
        tenStream.map(i->{
            i = i*10;
            i=i/5;
            return i;
        }).forEach(i->System.out.println(i));

    }
}
