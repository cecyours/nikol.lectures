import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P03_else_if_ladder
 */
public class CH03_P03_else_if_ladder {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the expression : ");
        String expr = br.readLine();
        String data[];

        if(expr.indexOf("+")!=-1)
        {
            // split by +

             data = expr.split("\\+");
             
             int n1 = Integer.parseInt(data[0]);
             int n2 = Integer.parseInt(data[1]);

             System.out.println(n1+" + "+n2+" = "+(n1+n2));

        }
        else if(expr.indexOf("-")!=-1)
        {
            // split by +

             data = expr.split("\\-");
             int n1 = Integer.parseInt(data[0]);
             int n2 = Integer.parseInt(data[1]);

             System.out.println(n1+" -"+n2+" = "+(n1-n2));

        }
        else if(expr.indexOf("x")!=-1 || expr.indexOf("*")!=-1)
        {
            // split by +

            String sign =expr.indexOf("x")!=-1?"x":"\\*";            
            
             data = expr.split(sign);
            
             sign = sign=="x"?"x":"*";

             int n1 = Integer.parseInt(data[0]);
             int n2 = Integer.parseInt(data[1]);

             System.out.println(n1+" "+sign+" "+n2+" = "+(n1*n2));

        }
        // continue...
        else{
            System.out.println("No suitable operator found..");
        }



    }
}