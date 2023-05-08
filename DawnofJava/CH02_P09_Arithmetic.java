
/* 
 *  Binary operation : bcz it has 2 operands..
 *  x + y = z
 *  operands : means variable or literals on which we perform the perticular operation.
 *  Operator : define the operation on given operands.
 * 
 * 
 */
/**
 * CH02_P09_Arithmetic
 */
import java.io.*;
public class CH02_P09_Arithmetic {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a,b;

        System.out.print("Enter the number : ");
        a = Integer.parseInt(br.readLine());


        System.out.print("Enter the number : ");
        b = Integer.parseInt(br.readLine());

        // 5,10
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" % "+b+" = "+(a%b));
        
        // 8.53 => 0.53
    }
}