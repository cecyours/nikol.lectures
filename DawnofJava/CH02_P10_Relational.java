
/**
 * CH02_P10_Relational : which returns boolean expression based on condition.
 */
import java.io.*;

public class CH02_P10_Relational {

    public static void main(String[] args) throws Exception {
        
                
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a,b;

        System.out.print("Enter the number : ");
        a = Integer.parseInt(br.readLine());


        System.out.print("Enter the number : ");
        b = Integer.parseInt(br.readLine());


        boolean f = a>b;
        boolean x = Boolean.parseBoolean("true");
        if(x) // it took boolean value as input..
        {
            System.out.println(a+" is max [a]");
        }
        else{
            System.out.println(b+" is max [b]");
        }

        System.out.println(a+" > "+b+" : "+(a>b));
        System.out.println(a+" < "+b+" : "+(a<b));
        System.out.println(a+" >= "+b+" : "+(a>=b));
        System.out.println(a+" <= "+b+" : "+(a<=b));
        System.out.println(a+" == "+b+" : "+(a==b));
        System.out.println(a+" != "+b+" : "+(a!=b));

    }
}

