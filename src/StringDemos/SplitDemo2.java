package StringDemos;

public class SplitDemo2 {
    public static void main(String[] args) {

        String str = "Hi this is Java";
        String[] stArr = str.split("i");

        for (int i=0;i< stArr.length;i++)
        {
            System.out.println(stArr[i]);
        }
    }
}
