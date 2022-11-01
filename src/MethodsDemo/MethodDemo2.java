package MethodsDemo;

import java.util.Date;

public class MethodDemo2 {


    int methodName()
    {
        // statements
        int a = 55;
        return a;
    }




    public static void main(String[] args) {

        int a = 90;

        int x = a;

       /// System.out.println(a);

        MethodDemo2 ob = new MethodDemo2();

        int y  = ob.methodName();

        System.out.println("y="+y);

        System.out.println(ob.methodName());



    }
}
