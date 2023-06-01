
/**
 * CH02_P02_abs_int
 */
import java.util.Scanner;
public class CH02_P02_abs_int {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n<0)
        {
            n *=-1;
        }

        System.out.println("your number is : "+n);
 
    }
}