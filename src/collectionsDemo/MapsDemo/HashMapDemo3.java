package collectionsDemo.MapsDemo;

import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println("isEmpty="+hm.isEmpty());

        hm.put(102,"amol");
        hm.put(103,"rahul");
        hm.put(112,"rohit");
        hm.put(202,"vaibhav");
        hm.put(332,"pranav");
        System.out.println("isEmpty="+hm.isEmpty());

        System.out.println("size="+hm.size());

        System.out.println(hm);

        System.out.println(hm.containsKey(2034));
        System.out.println(hm.containsValue("amol1"));

        hm.clear();

        System.out.println(hm);





    }
}
