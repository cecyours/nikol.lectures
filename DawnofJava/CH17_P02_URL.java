import java.net.*;
public class CH17_P02_URL {
    public static void main(String[] args) throws Exception {
        

        URL url = new URL("http://localhost/agriworld/agriworld/seller/");

        System.out.println("host : "+url.getHost());
        System.out.println("port : "+url.getPort());
        System.out.println("file :"+url.getFile());        
        System.out.println("file :"+url.getProtocol());


        
    }
}
