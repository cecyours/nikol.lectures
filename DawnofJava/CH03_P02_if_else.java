import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 


/**
 * CH03_P02_if_else
 */

//  index
public class CH03_P02_if_else {

    public static void main(String[] args) throws Exception {
        
 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the expression : ");
        String expr = br.readLine();
        double my_double = Double.parseDouble(expr); //String->double
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

        // 7.31 - 7 = 0.31
        int n = (int)my_double;

        double ans = my_double-n;
        System.out.println("new expression : "+ans);


        // Integer i = 19;
        // String s = i.toString();
    }
    
}