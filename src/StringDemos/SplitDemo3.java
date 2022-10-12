package StringDemos;

public class SplitDemo3 {
    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        // print the words those ends with y
        String[] stArr = str.split(" ");

      /*  for (int i=0;i< stArr.length;i++)
        {
            String tempString = stArr[i];
            int l = tempString.length();

            if(tempString.charAt(l-1)=='y')
                  System.out.println(stArr[i]);
        }*/

        for (int i=0;i< stArr.length;i++)
        {

            if(stArr[i].endsWith("y"))
                System.out.println(stArr[i]);
        }
    }
}
