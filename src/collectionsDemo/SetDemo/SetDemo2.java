package collectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("amol");
        lhs.add("rahul");
        lhs.add("rohit");
        lhs.add("vaibhav");
        lhs.add("pranav");
        lhs.add("nitin");
        lhs.add("shital");
        lhs.add("sonali");
        System.out.println(lhs.add("sonali"));

        System.out.println(lhs);
    }
}
