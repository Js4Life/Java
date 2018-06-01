import java.util.Date;
import java.text.*;

public class DateDemo {
    public static void main(String args[]) {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date:" + ft.format(dNow));

        Date date = new Date();
        System.out.printf(date.toString());

        String str = String.format("Current Date/time : %tc" , date);
        System.out.println(str);

          // display time and date
      System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);

       
      // display formatted date
      System.out.printf("%s %tB %<te, %<tY", "Due date:", date);

      SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
      String input = args.length == 0 ? "1818-11-11" : args[0];
      System.out.print(input + "Parses as");

      Date t;

      try {
          t = ft1.parse(input);
          System.out.println(t);
      } catch(ParseException e) {
          System.out.println("Unparseable using " + ft1);
      }

    }
}