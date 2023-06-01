

/**
 * CH02_P13_check_the_character
 */
import java.io.*;
public class CH02_P13_check_the_character {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the character : ");
        char ch = br.readLine().charAt(0);

        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
        {
            System.out.println("alphabet");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("Digits...");
        }
        else{
            System.out.println("It is special Symbol..\u8329");
        }
    }
    
}