package collectionsDemo.MapsDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(102,"amol");
        hm.put(103,"rahul");
        hm.put(112,"rohit");
        hm.put(202,"vaibhav");
        hm.put(332,"pranav");

        System.out.println(hm);

        HashMap<Integer,String> hm2 = new HashMap<>();
        System.out.println("hm2="+hm2);

        hm2.putAll(hm);
        System.out.println("hm2="+hm2);



    }
}
