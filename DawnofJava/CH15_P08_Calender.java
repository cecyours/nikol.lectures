import java.util.Calendar;

public class CH15_P08_Calender {
    public static void main(String[] args) {

        Calendar cl = Calendar.getInstance();

        cl.set(Calendar.MONTH, 6);

        System.out.println("Data : " + cl);
        System.out.println("time : " + cl.getTime());

        System.out.println(cl.get(Calendar.MONTH));

        int isPM = cl.get(Calendar.AM_PM);

        if (isPM == 1) {
            System.out.println("Good afternoon.");
        } else {
            System.out.println("Good morning...");
        }
    }
}
