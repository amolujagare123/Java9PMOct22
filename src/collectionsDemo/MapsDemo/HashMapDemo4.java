package collectionsDemo.MapsDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(102,"amol");
        hm.put(103,"rahul");
        hm.put(112,"rohit");
        hm.put(202,"vaibhav");
        hm.put(332,"pranav");

        System.out.println(hm);

       Set s = hm.keySet();
        System.out.println("keySet="+s);

     Collection values =  hm.values();
        System.out.println("values="+values);

        Set entrySet = hm.entrySet();
        System.out.println("entrySet="+entrySet);


    }
}
