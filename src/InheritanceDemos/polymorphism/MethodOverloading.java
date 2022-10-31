package InheritanceDemos.polymorphism;

public class MethodOverloading {


    int a;
    int b;
    int c;

    void addition()
    {
        c  = a + b ;
        System.out.println("Addition="+c);
    }

    void addition(int x,int y)
    {
        c  = x + y ;
        System.out.println("Addition="+c);
    }

    void addition(double x,double y)
    {
        double c  = x + y ;
        System.out.println("Addition="+c);
    }

    void addition(String x,String y)
    {
        String c  = x + y ;
        System.out.println("Addition="+c);
    }

    void addition(int x,int y,int z)
    {
        c  = x + y + z;
        System.out.println("Addition="+c);
    }

    public static void main(String[] args) {

        MethodOverloading ob = new MethodOverloading();
        ob.a = 10;
        ob.b = 20;
        ob.addition();
        ob.addition(24,56);
        ob.addition(10,10,10);
        ob.addition(24.55,56.89);
        ob.addition("Selenium","Java");

    }
}
