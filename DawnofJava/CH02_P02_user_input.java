// System.out -> monitor : output
// System.in -> keyboard : input
import java.util.Scanner;
class CH02_P02_user_input{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
 
        System.out.print("Enter the number : ");
        int m = sc.nextInt();

        int ans = n+m;
        System.out.println(n+" + "+m+" = "+ans);
    
        
        // TODO : perform all arithmetic operations.
        /* 
         * +,-,*,/,%
         */
    }
}

// class Home{

//     Room r;
// }

