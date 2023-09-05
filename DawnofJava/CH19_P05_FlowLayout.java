import javax.swing.*;
import java.awt.*;

public class CH19_P05_FlowLayout extends JFrame {

    public static void main(String[] args) {
        
        CH19_P05_FlowLayout f = new CH19_P05_FlowLayout();
        f.setTitle("Kites are flying...");
        f.setSize(500, 350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton b1 = new JButton("1");        
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");



        f.add(b1);      
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        

    }
    
}
