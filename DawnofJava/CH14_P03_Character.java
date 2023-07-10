import java.io.*;
public class CH14_P03_Character {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character : ");
        Character ch = br.readLine().charAt(0);


        System.out.println("isLetter : "+Character.isLetter(ch));
    }
}

// https://www.tutorialspoint.com/java/java_characters.htm
