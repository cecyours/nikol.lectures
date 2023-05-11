import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
import javax.swing.JButton;

/**
 * CH03_P02_if_else
 */

//  index
public class CH03_P02_if_else {

    public static void main(String[] args) throws Exception {
        
 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the expression : ");
        String expr = br.readLine();

        if(expr.indexOf('.')!=-1)
        {
           String data[] = expr.split("\\.");  // string double quotes.
           /* 
            * expr : 7.34
            * data[0] : 7
            * data[1] : 34
            */
            // System.out.println("part 1: "+data[0]);
            for(String x: data)
            {
                System.out.println("part : "+x);

            }
            System.out.println("new code : "+expr);
        }
        else{
            System.out.println("Invalid expression/ decimal point not found...");
        }

    }
    
}