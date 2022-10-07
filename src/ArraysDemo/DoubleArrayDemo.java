package ArraysDemo;

public class DoubleArrayDemo {

    public static void main(String[] args) {

        double[] a = new double[5];

        a[0] = 7.8;
        a[1] = 6.7;
        a[2] = 1.1;
        a[3] = 3.4;
        a[4] = 6.7;

        int l = a.length ; // length - instance variable
        //System.out.println(a[2]);
        System.out.println("length="+a.length);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }



    }
}
