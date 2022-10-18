package ClassConstructors;

public class ParameterizedDemo2 {

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


    ParameterizedDemo2(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }


    public static void main(String[] args) {

        ParameterizedDemo2 ob = new ParameterizedDemo2(12,34.67,'g',"java");
       
        ob.display();

    }

}
