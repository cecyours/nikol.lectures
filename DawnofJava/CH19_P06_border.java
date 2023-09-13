import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CH19_P06_border extends JFrame {
    
    JPanel panel;
    public CH19_P06_border(){
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(new JButton("EAST"),BorderLayout.EAST);
        panel.add(new JButton("NORTH"),BorderLayout.NORTH);

        panel.add(new JButton("SOUTH"),BorderLayout.SOUTH);
        panel.add(new JButton("WEST"),BorderLayout.WEST);     
         panel.add(new JButton("CENTER"),BorderLayout.CENTER); 



        this.add(panel);

    }
    public static void main(String[] args) {
        
        CH19_P06_border border = new CH19_P06_border();
        border.setSize(500,350);        
        border.setTitle("Kites are here.");

        border.setVisible(true);
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
