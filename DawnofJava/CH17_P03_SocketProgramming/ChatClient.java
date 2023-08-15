package CH17_P03_SocketProgramming;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.net.Socket;

public class ChatClient {
 
    public static void main(String[] args) throws Exception {
        
        /**
         c l i e n t
         * 
         * */ 
        Socket server = new Socket("localhost", 1023);
        System.out.println("Connected...");

        InputStream is = server.getInputStream();
        BufferedReader serverRequest = new BufferedReader(new InputStreamReader(is));

        OutputStream os = server.getOutputStream();
        PrintStream serverResponse = new PrintStream(os);    
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String msg = "";
        String serverMsg = "";

        while(!msg.equals("-1"))
        {
            serverMsg = serverRequest.readLine();
            System.out.println("SERVER : "+serverMsg);

            System.out.print("CLIENT : ");
            msg = br.readLine();

            serverResponse.println(msg); // send to server

        }


            serverResponse.close();
            server.close();

    }
}
