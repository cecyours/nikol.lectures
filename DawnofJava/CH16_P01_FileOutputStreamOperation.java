import java.io.FileOutputStream;

public class CH16_P01_FileOutputStreamOperation {

    /*  */
    public static void main(String[] args) throws Exception {

        FileOutputStream fout = new FileOutputStream("./demo.txt");

            String s = "SNEHA";
        fout.write(s.getBytes());

        System.out.println("file has been created..");
        fout.close();

    }
}
