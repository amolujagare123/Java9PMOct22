package collectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("rahul");
        v.add("rohit");
        v.add("vaibhav");
        v.add("pranav");
        v.add("nitin");
        v.add("shital");
        v.add("sonali");

        System.out.println(v);

        System.out.println("Using Iterator ......");
        Iterator itr = v.iterator();
               while (itr.hasNext())
                   System.out.println(itr.next());

               System.out.println("Using Enumeration ......");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
