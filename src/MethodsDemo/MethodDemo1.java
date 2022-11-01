package MethodsDemo;

import java.util.Date;

public class MethodDemo1 {

    void myMethod1(int a)
    {
        System.out.println("a="+a);
    }

    void myMethod2(int a,int b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    void myMethod3(int a,int b,int c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void myMethod4(int a,double b,char c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    void myMethod5(Date a, String b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);

    }

    void myMethod6(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    void myMethod7(String[][] st)
    {
        for (int i=0;i<st.length;i++)
        {
            for (int j=0;j<st[0].length;j++)
            {
                System.out.print(st[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MethodDemo1 ob = new MethodDemo1();
        ob.myMethod1(45);
        ob.myMethod2(11,22);
        ob.myMethod3(2,2,2);
        ob.myMethod4(23,56.7,'h');
        ob.myMethod5(new Date(),"Java");

        int[] x = {56,67,11,233,456,667};

        ob.myMethod6(x);

        String[][] stArr = {
                {"abc1","xyz1","pqr1"} ,           {"abc1","xyz1","pqr1"} ,
                {"abc2","xyz2","pqr2"} ,
                {"abc3","xyz3","pqr3"} ,
                {"abc4","xyz4","pqr4"} ,
                {"abc5","xyz5","pqr5"} ,
        };

        ob.myMethod7(stArr);

    }
}
