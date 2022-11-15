package collectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al  =  new ArrayList<>();

        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");
        al.add("nitin");
        al.add("shital");
        al.add("sonali");

        System.out.println("al="+al);

        ArrayList<String> al2  =  new ArrayList<>();

        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("al2="+al2);

        al2.add("xyz");
        System.out.println("al2="+al2);



    }
}
