package CH17_P03_SocketProgramming;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;

public class ServerCode {
    public static void main(String[] args) throws Exception {
        
        ServerSocket clientSocket = new ServerSocket(1025);

        System.out.println("Waiting for connection ....");

        Socket socket = clientSocket.accept(); // 1 connection

        System.out.println("Connected...");

        // server('hii') -> client()

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);

        ps.println("Hello Client..");

        InputStream is = socket.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String data = br.readLine();

        System.out.println("Client : "+data);
        socket.close();
        ps.close();
        clientSocket.close();
    }
}
