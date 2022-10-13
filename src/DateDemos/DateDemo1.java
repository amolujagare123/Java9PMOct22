package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        Date date = new Date(); // date
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = sd.format(date); // date to string converted
        System.out.println(dateStr);

        SimpleDateFormat sd1 = new SimpleDateFormat("dd-MM-yyyy");
        String dateStr1 = sd1.format(date); // date to string converted
        System.out.println(dateStr1);
    }
}
