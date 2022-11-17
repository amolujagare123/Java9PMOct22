package collectionsDemo.SetDemo;

import java.util.HashSet;

public class SetDemo1 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("amol");
        hs.add("rahul");
        hs.add("rohit");
        hs.add("vaibhav");
        hs.add("pranav");
        hs.add("nitin");
        hs.add("shital");
        hs.add("sonali");
        System.out.println(hs.add("sonali"));

        System.out.println(hs);
    }
}
