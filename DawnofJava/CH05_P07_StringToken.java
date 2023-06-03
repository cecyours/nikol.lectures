import java.io.*;
import java.util.StringTokenizer;
public class CH05_P07_StringToken {
    public static void main(String[] args) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the String  : ");
        String s = br.readLine();
        // hello Sneha coder
        System.out.print("Enter separator : ");
        String sep = br.readLine();
        
        StringTokenizer st = new StringTokenizer(s,sep);

        while(st.hasMoreTokens())
        {
           System.out.println(st.nextToken()); 
        }
    }
}
