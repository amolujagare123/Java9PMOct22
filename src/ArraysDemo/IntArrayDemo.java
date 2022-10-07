package ArraysDemo;

public class IntArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 78;
        a[1] = 67;
        a[2] = 11;
        a[3] = 34;
        a[4] = 67;

        int l = a.length ; // length - instance variable
        //System.out.println(a[2]);
        System.out.println("length="+a.length);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }



    }
}
