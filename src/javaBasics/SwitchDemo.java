package javaBasics;

public class SwitchDemo {

    public static void main(String[] args) {

        int a =50;
        int b = 10;
        int c;

        String operation = "";

        switch (operation)
        {
            case "add" : c = a+b;
                System.out.println("javaBasics.Addition="+c);
                break;

            case "sub" : c = a-b;
                System.out.println("Substraction="+c);
                break;

            case "mult" : c = a*b;
                System.out.println("Multiplication="+c);
                break;

            case "div" : c = a/b;
                System.out.println("Division="+c);
                break;

           /* default:
                System.out.println("Wrong choice");
                break;*/
        }
    }


}
