import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CH15_P10_FileWritter {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your Name : ");
        String sName = br.readLine();

        System.out.print("Enter your marks : ");
        double sMarks = Double.parseDouble(br.readLine());

        if(sMarks<33)
        {
            System.out.println("your are not enough to get in..");
            System.exit(0);
        }

        FileWriter file = new FileWriter("./CH15_P10_File.txt",true);

        file.write("\n"+sName+" : "+sMarks);

        System.out.println("operation done...");

        
        file.close();
    }
}
