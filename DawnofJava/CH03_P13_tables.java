import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P13_tables
 */
public class CH03_P13_tables {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the start number ");
        int start = Integer.parseInt(br.readLine());

        System.out.print("Enter the end number ");
        int end = Integer.parseInt(br.readLine());
        
        for(int n=start;n<=end;n++)
        {
            // display table of n
            for(int i=1;i<=10;i++)
            {
                System.out.printf("%2d x %2d = %2d\n",n,i,n*i);
            }
            System.out.println("-------------------");
        }
    }
}
/* TODO:
 * 
 * create horizontal table list.
 * like https://www.google.com/search?q=tables+in+maths&sxsrf=APwXEdfEgrw_IacRTpupxo_hpVIURRyOdg:1684768368207&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjlk_agm4n_AhWC4DgGHbkfDqgQ_AUoAXoECAEQAw&biw=1366&bih=664&dpr=1#imgrc=yRtfTa5kpYactM
  */

//   HII