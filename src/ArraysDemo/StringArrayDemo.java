package ArraysDemo;

public class StringArrayDemo {

    public static void main(String[] args) {

        String[] a = new String[5];

        a[0] = "Pavan";
        a[1] = "Kalandhar";
        a[2] = "Arindam";
        a[3] = "Asha";
        a[4] = "Harini";

        int l = a.length ; // length - instance variable
        //System.out.println(a[2]);
        System.out.println("length="+a.length);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }



    }
}
