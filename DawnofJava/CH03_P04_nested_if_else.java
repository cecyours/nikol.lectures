import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CH03_P04_nested_if_else
 */
public class CH03_P04_nested_if_else {

    public static void main(String[] args) throws Exception {
        
        // list of users
        String users[] = {"sneha7u","monnu","neha"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter username : ");
        String username = br.readLine();

        
        if(!Arrays.asList(users).contains(username))
        {
            System.out.println(username+" is avaiable..");
            System.out.print("Enter the password  :");
            String password = br.readLine();

            // bug for weekend (weak's end)
            String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]).{8,30}$";
            
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(password);
            
            if(m.matches())
            {
                System.out.println("great guess.");

                if(password.length()>=6)
                {
                    System.out.println("valid conditions..");
                }
                else
                {
                    System.out.println("not enough..");
                }
            }
            else{
                System.out.println("try to use all pattern..");
            }
        }
        else{
            System.out.println(username+" is already taken..");
        }

        
    }
}