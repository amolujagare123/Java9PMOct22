package WrapperclassDemo;

public class Conversions {

    public static void main(String[] args) {

        String s1 = "12";
        String s2 = "24";

        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println(i1+i2);

        String s3 = "12.34";
        String s4 = "24.56";

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        String s5 = "true";
       // String s6 = "false";

        boolean b1 = Boolean.parseBoolean(s5);
        //boolean b2 = Boolean.parseBoolean(s6);

        if (b1) // or (b1==true)
            System.out.println("b1 is true");
        else
            System.out.println("b1 is false");

        String s7 = "d";

        char  c = s7.charAt(0);
        System.out.println("c="+c);


    }
}
