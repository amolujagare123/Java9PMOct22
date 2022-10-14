package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate2 {

    public static void main(String[] args) throws ParseException {

        String dateStr3= "Thursday 2016/06/23";
        //→ EEEE yyyy/MM/dd
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date date3 = sd3.parse(dateStr3); // String to date
        System.out.println(date3);


        String dateStr4= "23-06-2016 | thu | 8:34";
        //→ dd-MM-yyyy | E | hh:mm
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        Date date4 = sd4.parse(dateStr4);
        System.out.println(date4);

        String dateStr5= "8:34:22" ;
        //→ hh:mm:ss
        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:ss");
        Date date5 = sd5.parse(dateStr5);
        System.out.println(date5);

    }
}
