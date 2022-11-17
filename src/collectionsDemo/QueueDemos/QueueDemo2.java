package collectionsDemo.QueueDemos;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo2 {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(34);
        adq.offer(14);
        adq.offer(11);
        adq.offer(54);
        adq.offer(38);
        adq.offer(24);
        adq.offer(39);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);


    }
}
