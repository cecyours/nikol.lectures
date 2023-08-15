package CH17_P03_SocketProgramming;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServerDemo {
    
    public static void main(String[] args) throws Exception {
        
        ServerSocket serverSocket = new ServerSocket(1024);

        System.out.println("Waiting....");
        Socket client = serverSocket.accept();
        System.out.println("Connected...");

        OutputStream os = client.getOutputStream();
        PrintStream ps = new PrintStream(os);
        
        InputStream is = client.getInputStream();
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(is));

        ps.println("We are connected...");

        // send file list;;

        String dirName = System.getProperty("user.dir");

        File dir = new File(dirName);
 
        int i=0;
        for(File f: dir.listFiles())
        {

            ps.println(" [ "+(++i)+" ] "+f.getName());
        }
        
        ps.println("list done");
        
        // get file name from client

        String fileName = clientInput.readLine();

        File file = new File(fileName);

        if(file.exists())
        {
            ps.println(true);
            FileInputStream f = new FileInputStream(file);

            int ch;
            while((ch=f.read())!=-1)
            {
                ps.print((char)ch);
            }
            ps.println(ch);

        }
        else{
            // not available
    
            ps.println(false);
        }
        System.out.println("Operation Done...");
        client.close();
    }
}
