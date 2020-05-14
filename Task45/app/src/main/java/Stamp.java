import java.text.SimpleDateFormat;
import java.util.Date;

public class Stamp {
    public static String printTimeStamp( String name)
    {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat();

        return "Made by: " + name+" on " + dateFormat.format(currentDate);
    }
}