package collectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListSetlDemo {

    public static void main(String[] args) {

        ArrayList<Integer> al  =  new ArrayList<>();

        al.add(13);
        al.add(43);
        al.add(53);
        al.add(17);
        al.add(12);
        al.add(25);

        System.out.println("al="+al);

        al.set(5,100);

        System.out.println("al="+al);

    }
}
