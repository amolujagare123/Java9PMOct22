package ClassConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str; // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        /*int x ;
        x = 10 ;*/

        MyClass ob = new MyClass();
        ob.a = 90;
        ob.d = 56.67;
        ob.c = 'h';
        ob.str = "laptop";

        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 80;
        ob2.d = 66.67;
        ob2.c = 'c';
        ob2.str = "desktop";

        ob2.display();
    }

}
