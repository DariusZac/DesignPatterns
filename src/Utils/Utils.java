package Utils;

import java.util.Calendar;
import java.util.Date;

public class Utils {

    public static Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }

    public static void printFromArray(String[] array) {
        for (String string : array) {
            System.out.print(string + " ");
        }
        System.out.println("\n/////////////");
    }
}
