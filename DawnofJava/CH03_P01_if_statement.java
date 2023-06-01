import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P01_if_statement
 */
public class CH03_P01_if_statement {

    public static void main(String[] args) throws Exception {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String ");

        String line = br.readLine();
        char ch = '-';

        int x = line.indexOf(ch);
        
        if(x!=-1)   
            System.out.println(ch+" found at "+(x+1));

        System.out.println("value of x : "+x);

        int i=0;
        for(i=1;i<=10;i++)
           System.out.print("line "+i);
    }
}