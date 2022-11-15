package collectionsDemo.LinkedListDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(13);
        ll.add(43);
        ll.add(53);
        ll.add(17);
        ll.add(12);
        ll.add(25);

        System.out.println(ll);

        ll.addFirst(0);
        ll.addLast(100);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
