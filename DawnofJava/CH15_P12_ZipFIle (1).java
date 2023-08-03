import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CH15_P12_ZipFIle {
    public static void main(String[] args) throws Exception {
        final int BUFFER = 1024;
        ZipOutputStream zos = null;
        BufferedInputStream bis = null;
        try {
            // path of the file that we want to compress
            String fileName = "./CH15_P12_ZipFIle.java";
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis, BUFFER);
            // creating ZipOutputStream
            // creates a zip file with the specified name
            FileOutputStream fos = new FileOutputStream("./CH15_P12_ZipFIle.zip");
            // ZipOutputStream writes data to an output stream in zip format
            zos = new ZipOutputStream(fos);
            // ZipEntry, here file name can be created using the source file
            ZipEntry ze = new ZipEntry(file.getName());
            // putting zipentry in zipoutputstream
            zos.putNextEntry(ze);
            byte data[] = new byte[BUFFER];
            int count;
            while ((count = bis.read(data, 0, BUFFER)) != -1) {
                zos.write(data, 0, count);
            }
            System.out.println("Hello World....");
        } catch (IOException ioExp) {
            System.out.println("Error while zipping " + ioExp.getMessage());
        } finally {
            if (zos != null) {
                try {
                    // closing output stream
                    zos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    // closing buffered input stream
                    bis.close();
                } catch (IOException e) {
                    // prints exception
                    e.printStackTrace();
                }

            }
        }
    }
}
