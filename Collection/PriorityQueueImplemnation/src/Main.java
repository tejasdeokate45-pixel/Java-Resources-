import java.util.PriorityQueue;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();// smallest elemsnt will be deleted forst
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//largets will delete first

        pq.offer(100);
        pq.offer(120);
        pq.offer(100);
        pq.offer(20);// by default first it will delete
        pq.offer(30);
        pq.offer(40);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);

    }
}