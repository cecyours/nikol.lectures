import java.io.*;
// https://www.geeksforgeeks.org/file-class-in-java/
// unzip ..
public class CH15_P13_FileClass {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter file Name  : ");
        String fileName = br.readLine();

        File file = new File("./"+fileName);

        System.out.println(" executable : "+file.canExecute()); 
        System.out.println("      write : "+file.canWrite());        
        System.out.println("       read : "+file.canRead());



        
    }
}
