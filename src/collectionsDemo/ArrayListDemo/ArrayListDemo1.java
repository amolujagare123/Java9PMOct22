package collectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al  =  new ArrayList();

        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add(12);
        al.add(12);
        al.add(13);
        al.add(15.2);
        al.add('c');
        al.add(true);
        al.add(true);

        System.out.println(al);

        System.out.println("using for loop.....");
        for (int i=0;i<al.size();i++)
           System.out.println(al.get(i));

        System.out.println("using Iterator.....");
        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


    }
}
