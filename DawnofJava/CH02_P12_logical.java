
/**
 * CH02_P12_logical
 */
import java.io.*;
public class CH02_P12_logical {

    public static void main(String[] args) throws Exception {
        
        //  logical AND && : all conditions must be true to get the true block.
        //   logical OR : any  condition must be true to get the true block.
        //  logical NOT : reverse the logical.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter the username : ");
        String username = br.readLine();


        System.out.print("Enter the password : ");
        String password = br.readLine();

        // if((uname.equals("Sneha") || uname.equals("ip@gmail.com")) && uname.equals("Someone") && upass.equals("123")
        if((username.equals("sneha") || username.equals("ip@gmail.com")) &&  (password.equals("123")))
        {
            System.out.println("welcome...");
        }
        else
        {
            System.out.print("invalid username/password");
        }
        
        // 
        if(!username.equals("Sneha"))
        {
            System.out.print("you are not allowed to enter...");
        }

    }
}