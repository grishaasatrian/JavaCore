package classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {

    public static void main(String[] args) throws ParseException {
        //14-02-2023 20:22:15
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
//        System.out.println(date);
        //date to string
        String dateStr = sdf.format(date);
        System.out.println(dateStr);

//        System.out.println("Please input date(14-02-2023)");
//        Scanner scanner = new Scanner(System.in);
//        String myDateStr = scanner.nextLine();
//        Date parse = sdf.parse(myDateStr);

//        System.out.println(parse);
    }
}