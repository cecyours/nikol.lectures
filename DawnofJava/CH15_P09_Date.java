import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CH15_P09_Date {
    public static void main(String[] args) {
        
        Date d = new Date();

        System.out.println("Dummy : "+d);

        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,Locale.ITALIAN);

        String date = df.format(d);

        System.out.println("Org : "+date);
    }
}
