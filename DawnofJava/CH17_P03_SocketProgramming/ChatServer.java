package CH17_P03_SocketProgramming;

import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        
        /**
         s e r v e r
         * 
         * */ 

        ServerSocket serverSocket = new ServerSocket(1023);

        // create client

        System.out.println("Waiting for connection...");
        Socket client  = serverSocket.accept();
        System.out.println("Connected..");

        // first chat

        InputStream  is = client.getInputStream();

        BufferedReader clientRequest = new BufferedReader(new InputStreamReader(is));

        OutputStream os = client.getOutputStream();

        PrintStream clientResponse = new PrintStream(os);

        clientResponse.println("welcome to Hello Wor,ld...");

        String msg = "";
        String clientMsg = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(!clientMsg.equals("-1"))
        {
            clientMsg = clientRequest.readLine();
            System.out.println("CLIENT : "+clientMsg);

            System.out.print("SERVER : ");
            msg = br.readLine();

            clientResponse.println(msg);

        }

        clientResponse.close();
        client.close();
    }
}
