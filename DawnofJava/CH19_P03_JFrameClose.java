import javax.swing.*;

public class CH19_P03_JFrameClose extends JFrame {
    public static void main(String[] args) {
        
        CH19_P03_JFrameClose f =  new CH19_P03_JFrameClose();

        f.setTitle("Kites are flying..");

        f.setSize(500, 350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
