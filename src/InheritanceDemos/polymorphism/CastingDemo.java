package InheritanceDemos.polymorphism;

public class CastingDemo {

    public static void main(String[] args) {

        int a  = 10;
        int b  = 3;

        double c = (double) a/b;
        // if you want to store one type of value into another type
        // we do typecasting
        // use that type in round bracket for e.g. (double) in front of
        // the value to be stored in another type of variable
        System.out.println("c="+c);

      /*  String str = "10";
        int a1 = (int) str; */
        // we can typecast
        // primitive to primitive or non primitive to non primitive only

    }
}
