import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P07_while_sum
 */
public class CH03_P07_while_sum {

    public static void main(String[] args) throws Exception {

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int num;
        
        while(sum<=100)
        {
            System.out.print("Enter the number : ");
            num = Integer.parseInt(br.readLine());

            sum+=num;

            System.out.println("sum : "+sum);
        }
        System.out.println("final sum : "+sum);

    }
}