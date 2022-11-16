package collectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(32);
        s.push(14);
        s.push(52);
        s.push(18);
        s.push(56);
        s.push(92);

        System.out.println(s);

        System.out.println(s.search(54));
        System.out.println(s.search(18));


    }
}
