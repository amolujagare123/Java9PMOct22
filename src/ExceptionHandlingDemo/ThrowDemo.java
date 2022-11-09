package ExceptionHandlingDemo;

public class ThrowDemo {

    void checkNumber(int n) throws Exception {
        if(n<=10 && n>=1)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) throws Exception {

        int x = 15 ;

        ThrowDemo ob = new ThrowDemo();

        ob.checkNumber(x);

        System.out.println("x="+x);
        System.out.println("end of the program");

    }
}
