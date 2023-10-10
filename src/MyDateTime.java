import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime {
    public static void main(String[] args) {

        //Automation Test Announcement 05/01/2021 06:38:28 MDT

//        Calendar cal = Calendar.getInstance();
//        SimpleDateFormat simpleformat = new SimpleDateFormat("MMMM-dd-yyyy");
//        SimpleDateFormat simpleformat = new SimpleDateFormat("MMMM-dd-yyyy");
//        String currentDate = simpleformat.format(cal.getTime());
//        date = currentDate.split("-");

//        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
//        String datePart = date.format(new Date()).toString();
//        System.out.println("current date: " + datePart);

//        DateFormat time = new SimpleDateFormat("hh:mm:ss aa");
//        String timePart = time.format(new Date()).toString();
//        System.out.println("current time: " + timePart);

        Calendar cal = Calendar.getInstance();

        if(!(cal.get(Calendar.SECOND) > 0 && cal.get(Calendar.SECOND) < 51)) {
            boolean dangerTime = true;
            System.out.println("danger range (" + cal.get(Calendar.SECOND) + ")");

            while(dangerTime) {
                cal = Calendar.getInstance();
                System.out.print(".");

                if(cal.get(Calendar.SECOND) > 0 && cal.get(Calendar.SECOND) < 51) {
                    dangerTime = false;
                    System.out.println("out of danger");
                }
            }
        }

        System.out.println("in safe range (" + cal.get(Calendar.SECOND) + ")");
    }
}
