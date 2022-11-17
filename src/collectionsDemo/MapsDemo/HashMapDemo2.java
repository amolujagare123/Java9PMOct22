package collectionsDemo.MapsDemo;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(102,"amol");
        hm.put(103,"rahul");
        hm.put(112,"rohit");
        hm.put(202,"vaibhav");
        hm.put(332,"pranav");

        System.out.println(hm);

        System.out.println(hm.get(202));

        hm.remove(332);

        System.out.println(hm);



    }
}
