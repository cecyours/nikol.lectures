package CH17_P03_SocketProgramming;

import java.io.*;
import java.net.Socket;
 

public class FileClientDemo {
    
    public static void main(String[] args) throws Exception {
       
        Socket server  = new Socket("localhost", 1024);

        System.out.println("Connected..");

        InputStream is = server.getInputStream();
        BufferedReader serverInput = new BufferedReader(new InputStreamReader(is));

        OutputStream os = server.getOutputStream();
        PrintStream ps = new PrintStream(os);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String serverMsg = "";

        while(!serverMsg.equals("list done"))
        {
            serverMsg = serverInput.readLine();
            System.out.println(serverMsg+"..");
        }

        System.out.println("Enter file Name : ");
        String file = br.readLine();
        
        ps.println(file);
        
        boolean f = Boolean.parseBoolean(serverInput.readLine());

        if(f)
        {
            System.out.println("file is avaible");
            // code to download file

            int data;
            FileOutputStream fDownload = new FileOutputStream("./newFile.txt");
            while((data=serverInput.read())!=-1)
            {
                fDownload.write(data);
            }
            fDownload.close();
            System.out.println("Operation done...");

        }
        else{
            System.out.println("File is not available..");
        }
        server.close();
    }
}
