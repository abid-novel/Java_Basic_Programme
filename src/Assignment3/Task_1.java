package Assignment3;

//Task_1: Write a program to calculate difference between today and your birthday

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task_1 {
    public static void main(String[] args) throws ParseException {
        String thatDay = "20-12-1994 06:30:25 PM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        Date myBirthDate = formatter.parse(thatDay);
        Date presentDate = new Date();

        long dateDiff = presentDate.getTime() - myBirthDate.getTime();
        long year = dateDiff/(1000l * 60 * 60 * 24 * 365);
        long day = (dateDiff/(1000 * 60 * 60 * 24)) % 365;
        long hour = (dateDiff/(1000 * 60 * 60)) % 24;
        long minute = (dateDiff/(1000 * 60)) %60;
        long second = dateDiff/1000 %60;


        System.out.println("Date Difference is: ");
        System.out.println(year+" Year");
        System.out.println(day+" Day");
        System.out.println(hour+" Hour");
        System.out.println(minute+" Minute");
        System.out.println(second+" Second");

    }
}
