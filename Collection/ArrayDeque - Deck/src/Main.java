import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);// add 12 at last
        adq.offerFirst(6);// add 6 at the beginning
        adq.offerLast(18);// add at last similar to .offer()
        adq.offer(24);
        System.out.println(adq);

        System.out.println(adq.peek()); // display the first element 6
        System.out.println(adq.peekFirst()); // display 6 similar to peek()
        System.out.println(adq.peekLast()); // display 24

        System.out.println(adq.poll());// delete 6 as its first
        System.out.println(adq); // 12 18 24
        System.out.println(adq.pollFirst());// delete 12 as now its first in the queue
        System.out.println(adq); //18 24
        System.out.println(adq.pollLast()); // delete 24 as it is in last
        System.out.println(adq); // 18

    }
}