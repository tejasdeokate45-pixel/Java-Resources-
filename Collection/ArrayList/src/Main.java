import java.util.ArrayList;
public class Main{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(14);
        list.add(15);
        // add at the last
        System.out.println(list);

        list.add(1,12);// adding at a specific index

        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(170);
        newList.add(180);
        newList.add(190);

        list.addAll(newList);   // Adding ArrayList inside a ArrayList

        System.out.println(list);



    }
}