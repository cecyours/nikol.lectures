import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * CH03_P06_switch_vowels_consonantes
 */
public class CH03_P06_switch_vowels_consonantes {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the character : ");
        char ch = br.readLine().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        switch(ch)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':System.out.println("Vowels...");break;
            default:System.out.println("the character is consonants");
            
            
        }
        

    }
}
