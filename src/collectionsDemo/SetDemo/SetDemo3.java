package collectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("amol");
        ts.add("rahul");
        ts.add("rohit");
        ts.add("vaibhav");
        ts.add("pranav");
        ts.add("nitin");
        ts.add("shital");
        ts.add("sonali");
        System.out.println(ts.add("sonali"));

        System.out.println(ts);
    }
}
