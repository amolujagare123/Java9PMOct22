package collectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> al  =  new ArrayList<>();

        System.out.println(al.isEmpty()); // true
        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");
        al.add("nitin");
        al.add("shital");
        al.add("sonali");
        al.add("rahul");
        System.out.println(al.isEmpty()); // false

        System.out.println("al="+al);

        al.remove("rahul");
        al.remove(4);

        System.out.println("al="+al);

        al.clear();

        System.out.println("al="+al);


    }
}
