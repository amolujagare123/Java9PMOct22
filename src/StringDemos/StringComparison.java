package StringDemos;

public class StringComparison {

    public static void main(String[] args) {

        int a = 100;
        int b = 100;

        System.out.println(a==b);

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "xyz";
        String str5 = new String("amol");

        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1==str2);
        System.out.println(str1.equals(str5));

        System.out.println(str1==str5);


    }
}
