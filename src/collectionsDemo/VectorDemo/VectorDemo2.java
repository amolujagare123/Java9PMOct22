package collectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("capacity="+v.capacity());// 10
        System.out.println("Size="+v.size());// 0

        v.add("amol");
        v.add("rahul");
        v.add("rohit");
        v.add("vaibhav");
        v.add("pranav");
        v.add("nitin");
        v.add("shital");
        v.add("sonali");
        v.add("shital");
        v.add("sonali");
        v.add("sonali");
        v.add("rohit");
        v.add("vaibhav");
        v.add("pranav");
        v.add("nitin");
        v.add("shital");
        v.add("sonali");
        v.add("shital");
        v.add("sonali");
        v.add("sonali");
        v.add("sonali");

        System.out.println("capacity="+v.capacity()); // 40
        System.out.println("Size="+v.size()); // 21

        //System.out.println(v);

    }
}
