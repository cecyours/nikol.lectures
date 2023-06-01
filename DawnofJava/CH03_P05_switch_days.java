import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P05_switch_days
 */
public class CH03_P05_switch_days {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the day number : ");
        int day = Integer.parseInt(br.readLine());

        switch(day)
        {
            case 1: System.out.println("MONDAY");break;
            case 2: System.out.println("TUESDAY");break;
            case 3: System.out.println("WEDNESDAY");break;
            case 4: System.out.println("THURSDAY");break;
            case 5: System.out.println("FRIDAYDAY");break;
            case 6: System.out.println("SATURDAY");break;
            case 7: System.out.println("SUNDAY");break;
            default: System.out.println("Invalid..");
        }
    }
}