package ArraysDemo;

public class CharArrayDemo {

    public static void main(String[] args) {

        char[] a = new char[5];

        a[0] = 'a';
        a[1] = 's';
        a[2] = 'd';
        a[3] = 'f';
        a[4] = 'h';

        int l = a.length ; // length - instance variable
        //System.out.println(a[2]);
        System.out.println("length="+a.length);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }



    }
}
