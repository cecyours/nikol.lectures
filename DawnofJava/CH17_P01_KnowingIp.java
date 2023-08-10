import java.io.*;
import java.net.InetAddress;
public class CH17_P01_KnowingIp {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the website : ");
        String site = br.readLine();

            try{
                
                InetAddress ip = InetAddress.getByName(site);

                System.out.println(ip+" is your ip");

            }catch(Exception e)
            {
                System.out.println("Error....");
            }
    }
}
