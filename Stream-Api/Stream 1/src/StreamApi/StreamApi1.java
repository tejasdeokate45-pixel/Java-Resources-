package StreamApi;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApi1 {
    public static void main(String args[]){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);// this will create a immutable list
        //list.add(10); //throw and error because we created a immutable list


        /* Boilerplate code

        for(Integer i : list){
        List<Integer> evenList= new ArrayList<>();// for storing even in new Array lIst
            if(i%2==0){
                evenList.add(i);
            }
        }
         */

        System.out.println("Normal Element List : "+list);
//        System.out.println("Even Element :: "+evenList);

        List<Integer> evenList = list.stream().filter(i->i%2==0).toList();
        System.out.println(evenList);

    }
}
