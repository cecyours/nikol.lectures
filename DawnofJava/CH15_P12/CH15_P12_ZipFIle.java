import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CH15_P12_ZipFIle {
    public static void main(String[] args) throws Exception {
       
        // file

        File file = new File("./CH15_P12_ZipFIle.java");
        FileInputStream fin = new FileInputStream(file);
        int BUFFER = 1024;
        
        BufferedInputStream bis = new BufferedInputStream(fin, BUFFER);
        // zip

      FileOutputStream fos = new FileOutputStream("./CH15_P12.zip");  
        ZipOutputStream zip = new ZipOutputStream(fos);

        ZipEntry zEntry = new ZipEntry(file.getName());

        zip.putNextEntry(zEntry);

        byte data[] = new byte[BUFFER];  

        int ch;
        while((ch=bis.read(data,0,BUFFER))!=-1)
        {
            zip.write(data, 0, ch);
        }

        zip.close();
        fin.close();

        System.out.println("file created...");
    }
}
