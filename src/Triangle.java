public class Triangle {

    public static void main(String[] args) {

        int a = 30;
        int b = 60;
        int c = 90;

        if(a==b && b==c)
            System.out.println("Equilateral Triangle");

        if ( a!=b && b!=c && c!=a)
            System.out.println("Scalene Triangle");

        if (a==90 || b==90 || c ==90)
            System.out.println("Right angled Triangle");

        if((a==b&b!=c) || (b==c && c!=a) || (c==a && b!=c))
            System.out.println("Isosceles Triangle");
    }
}
