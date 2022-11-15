package collectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class RemoveIfDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al  =  new ArrayList<>();

        al.add("amol");
        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");
        al.add("nitin");
        al.add("shital");
        al.add("sonali");

        System.out.println("al="+al);

        // remove the elements that starts with s
        // str -> str.startsWith("s")

        //al.removeIf( str -> str.startsWith("s"));

        // remove the elements whose length = 5
        // str -> str.length()==5
       // al.removeIf( str -> str.length()==5 );
        al.removeIf( str -> str.equals("amol") );
        System.out.println("al="+al);

    }
}
