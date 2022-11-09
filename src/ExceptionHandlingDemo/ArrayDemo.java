package ExceptionHandlingDemo;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 90;
            a[1] = 90;
            a[2] = 90;
            a[3] = 90;
            a[4] = 90;
            a[5] = 90;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
        }

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
