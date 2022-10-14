package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {

        String str = "12/04/2017"; // convert String to Date
        System.out.println(str);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sd.parse(str);
        System.out.println(date);
    }
}
