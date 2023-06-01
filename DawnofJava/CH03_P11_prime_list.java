import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P11_prime_list
 */
public class CH03_P11_prime_list {

    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number : ");
        int number = Integer.parseInt(br.readLine());

        if(Prime.isPrime(number))
        {
            System.out.println(number+" is prime");
        }
        else{
            System.out.println(number+" is not prime");
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