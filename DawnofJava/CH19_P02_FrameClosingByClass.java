import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CH19_P02_FrameClosingByClass extends Frame {
 
    
    public static void main(String[] args) {
        
        CH19_P02_FrameClosingByClass f = new CH19_P02_FrameClosingByClass();

        f.setTitle("Kites");
        f.setSize(500, 350);
        f.setBackground(new Color(12));
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            
            public void windowClosed(WindowEvent e)
            {
                System.out.println("you closed...");
            }

            public void windowClosing(WindowEvent e)
            {
                System.out.println("i am closing..");
                // write a statement to close the Frame without System.exit
                f.dispose();
            }
        });
    }
}
