import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P08_While_Reverse
 */
public class CH03_P08_While_Reverse {

    public static void main(String[] args) throws Exception {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int num,rem,rev=0;
        System.out.print("Enter your number : ");
        num = Integer.parseInt(br.readLine());//123 

        /***
         *  rev (rev*10+rem)    rem(num%10)      num(num/10)
         * -------------------------------------------------
         *      3                     3               123
         *      32                    2               12
         *      321                   1               1
         * ----------------------------------------------
         *                                            0                              
          */

          while(num>0)
          {

            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
            System.out.printf("%3d %3d %3d\n",num,rem,rev);
          }

          System.out.println("new number : "+rev);

    }
}