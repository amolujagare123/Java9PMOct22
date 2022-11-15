package collectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAllDemo {

    public static void main(String[] args) {

        ArrayList<Integer> al  =  new ArrayList<>();

        al.add(13);
        al.add(43);
        al.add(53);
        al.add(17);
        al.add(12);
        al.add(25);

        System.out.println("al="+al);

        ArrayList<Integer> al2  =  new ArrayList<>();

        al2.add(53);
        al2.add(17);
        al2.add(12);
        al2.add(52);
        al2.add(62);
        al2.add(72);
        al2.add(92);

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);

    }
}
