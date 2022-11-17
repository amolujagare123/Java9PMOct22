package collectionsDemo.QueueDemos;

import java.util.PriorityQueue;

public class QueueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(34);
        pq.offer(14);
        pq.offer(11);
        pq.offer(54);
        pq.offer(38);
        pq.offer(24);
        pq.offer(39);

        // 11,14,24,38,39,54
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
