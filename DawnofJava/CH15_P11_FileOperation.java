import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CH15_P11_FileOperation {
    
    public static void main(String[] args) throws Exception {
        
        String fileName = "./CH15_P10_File.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your Name : ");
        String sName = br.readLine();

        System.out.print("Enter your marks : ");
        double sMarks = Double.parseDouble(br.readLine());

        if(sMarks<33 && false)
        {
            System.out.println("your are not enough to get in..");
            System.exit(0);
        }

        // 
        FileReader fRead = new FileReader(fileName);

        int ch;
        String sData ="";
        while((ch=fRead.read())!=-1)
        {
            sData+=(char)ch+"";
        }

        
        
        if(sData.toLowerCase().contains(sName.toLowerCase()))
        {
            System.out.println("Student name is already there...");
            System.exit(0);
        }

        FileWriter file = new FileWriter(fileName,true);

        file.write("\n"+sName+" : "+sMarks);

        System.out.println("operation done...");

        fRead.close();         
        file.close();
    }
}
