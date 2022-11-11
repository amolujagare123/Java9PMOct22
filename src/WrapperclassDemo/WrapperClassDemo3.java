package WrapperclassDemo;

public class WrapperClassDemo3 {

    public static void main(String[] args) {



        Integer ii = new Integer(5);

        System.out.println("ii="+ii);

        int i1 = ii.intValue(); // unwrapping / unboxing
        System.out.println("i1="+i1);

        int i2 = ii; // auto unwrapping / auto unboxing
        System.out.println("i2="+i2);


    }
}
