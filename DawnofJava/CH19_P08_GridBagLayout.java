import javax.swing.*;
import java.awt.*;

/**
 * CH19_P08_GridBagLayout
 */
public class CH19_P08_GridBagLayout extends JFrame {

    public CH19_P08_GridBagLayout(){

        // layout
        GridBagLayout gLayout = new GridBagLayout();
        this.setLayout(gLayout);
        
        // helper
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;        
        gbc.gridy = 0;
        this.add(new JButton("Apple"),gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;        
        gbc.gridy = 0;
        this.add(new JButton("Banana"),gbc);


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;        
        gbc.gridy = 1;
        gbc.gridwidth=2;
        this.add(new JButton("Cherry"),gbc);
        
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;        
        gbc.gridy = 2;
        gbc.gridwidth=1;
        gbc.gridheight=4;
        gbc.ipady=10;
        this.add(new JButton("Mango"),gbc);


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;        
        gbc.gridy = 2;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        this.add(new JButton("Orange"),gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;        
        gbc.gridy = 3;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        this.add(new JButton("Orange"),gbc);



        



    }
    public static void main(String[] args) {
        CH19_P08_GridBagLayout f = new CH19_P08_GridBagLayout();
        f.setTitle("Kali Linux");
        f.setSize(500, 350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}