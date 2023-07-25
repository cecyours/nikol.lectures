import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CH16_P03_FileInputStream {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("File Name : ");
        String fileName = br.readLine();

        FileInputStream fin = new FileInputStream(fileName);

        int ch;

        while((ch=fin.read())!=-1)
        {
            System.out.print((char)ch);
        }
    }
}
