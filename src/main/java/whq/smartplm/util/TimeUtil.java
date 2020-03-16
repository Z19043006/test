package whq.smartplm.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Timestamp getTime() {
        try {
            return new Timestamp(format.parse(format.format(new Date())).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Timestamp dateToTimestamp(Date date) {
        try {
            return new Timestamp(format.parse(format.format(date)).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
