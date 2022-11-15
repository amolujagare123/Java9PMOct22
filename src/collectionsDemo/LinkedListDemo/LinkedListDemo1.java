package collectionsDemo.LinkedListDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("rahul");
        ll.add("rohit");
        ll.add("vaibhav");
        ll.add("pranav");
        ll.add("nitin");
        ll.add("shital");
        ll.add("sonali");

        System.out.println(ll);

        Collections.sort(ll);

        System.out.println(ll);
    }
}
