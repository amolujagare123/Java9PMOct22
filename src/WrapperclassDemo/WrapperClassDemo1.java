package WrapperclassDemo;

import java.util.ArrayList;

public class WrapperClassDemo1 {

    public static void main(String[] args) {

       ArrayList<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(24);


        Integer ii = 23;
        //al.remove(new Integer(23));
        al.remove(ii);

        System.out.println(al);
       /* al.add("amol");
        al.add("gogul");
        al.add("nilesh");
        al.add("harini");
        al.add("renu");*/
        /*al.add(23);
        al.add(24);
        al.add(2.4);
        al.add('c');
        al.add(true);*/

   //     System.out.println(al);


    }
}
