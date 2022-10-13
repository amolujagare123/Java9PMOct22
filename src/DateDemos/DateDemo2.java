package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) {

        Date date = new Date(); // date
        System.out.println(date);
       // Convert current system date in given patterns

        //→  dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");

        String dateStr0 = sd0.format(date);
      //  System.out.println(sd0.format(date));

        System.out.println(dateStr0);

        //→ dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);

        //→ yyyy-MM-dd | hh:mm:ss
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        String dateStr2 = sd2.format(date);
        System.out.println(dateStr2);


    }
}
