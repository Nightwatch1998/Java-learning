import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class DateDemo {

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        System.out.println(year);
    }
}