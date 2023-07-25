import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class CH16_P02_StoreDetails {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the student Name : ");
        String sName = br.readLine();

        // create file

        FileOutputStream fout = new FileOutputStream("./demo.txt",true);
        fout.write(sName.getBytes());
        fout.write('\n');

        fout.close();
        System.out.println("data has been inserted...");
    }
}
