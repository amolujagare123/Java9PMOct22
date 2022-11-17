package collectionsDemo.MapsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(102,"amol");
        lhm.put(103,"rahul");
        lhm.put(112,"rohit");
        lhm.put(202,"vaibhav");
        lhm.put(332,"pranav");
        lhm.put(null,"pranav");
        lhm.put(111,null);

        System.out.println(lhm);





    }
}
