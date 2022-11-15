package collectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al  =  new ArrayList<>();

        al.add(13);
        al.add(43);
        al.add(53);
        al.add(17);
        al.add(12);
        al.add(25);

        System.out.println("al="+al);

       // Integer ii = new Integer(53); // wrapping / boxing
        Integer ii = 53; // auto wrapping / auto boxing

        al.remove(ii);

        System.out.println("al="+al);


    }
}
