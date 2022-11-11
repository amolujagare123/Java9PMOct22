package WrapperclassDemo;

public class WrapperClassDemo2 {

    public static void main(String[] args) {

        int i = 5;
        System.out.println("i="+i);

        Integer ii = new Integer(5); // wrapping / boxing
        System.out.println("ii="+ii);

        Integer ii1 = 5;  // auto wrapping / auto boxing
        System.out.println("ii1="+ii1);


    }
}
