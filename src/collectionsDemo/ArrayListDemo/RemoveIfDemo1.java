package collectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class RemoveIfDemo1 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(13);
        al.add(43);
        al.add(53);
        al.add(17);
        al.add(12);
        al.add(25);

        System.out.println(al);
        // remove elements which are less than 20
        //  a -> a<20
        // al.removeIf( variable | predicate symbol | condition)
        //al.removeIf(a -> a<20);

        // remove elements which are odd numbers
        // b -> b%2 != 0

        al.removeIf(b -> b%2 != 0);

        System.out.println(al);

    }
}
