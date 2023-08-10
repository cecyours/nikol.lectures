package CH17_P03_SocketProgramming;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ClientCode  {
    public static void main(String[] args) throws Exception {
        
        Socket server = new Socket("localhost",1025);

        System.out.println("im connected.");

        // server -> client
        InputStream is = server.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String data = br.readLine();
        
        System.out.println("Server : "+data);

        // 
        // client -> server

        OutputStream os = server.getOutputStream();

        PrintStream ps = new PrintStream(os);
        ps.println("Hello Sir. can u help me !!");
        is.close();
        server.close();
    }
}
