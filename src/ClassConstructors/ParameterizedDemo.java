package ClassConstructors;

public class ParameterizedDemo {

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




    ParameterizedDemo(int a1,double d1, char c1,String str1)
    {
       a = a1;
       d = d1;
       c = c1;
       str = str1;
    }


    public static void main(String[] args) {

        ParameterizedDemo ob = new ParameterizedDemo(12,34.67,'g',"java");

        ob.display();

    }

}
