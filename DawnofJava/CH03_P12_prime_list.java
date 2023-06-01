import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P12_prime_list
 */
public class CH03_P12_prime_list {

    public static void main(String[] args) throws Exception {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the number : ");
        int number = Integer.parseInt(br.readLine());

        for(int i=2;i<=number;i++)
        {
            if(Prime.isPrime(i))
                System.out.println(i);
        }
        
    }
}
class Prime{

    static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}