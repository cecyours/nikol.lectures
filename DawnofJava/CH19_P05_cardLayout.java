import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class CH19_P05_cardLayout extends JFrame implements ActionListener {
    
    CardLayout card;
    JButton btnApple,btnBanana,btnCherry;
    Container cPane;

    public CH19_P05_cardLayout(){

        cPane = getContentPane();
        card = new CardLayout();
        cPane.setLayout(card);

        btnApple = new JButton("Apple");
        btnBanana = new JButton("Banana");
        btnCherry = new JButton("Cherry");

        btnApple.addActionListener(this);
        btnBanana.addActionListener(this);
        btnCherry.addActionListener(this);

        cPane.add(btnApple);
        cPane.add(btnBanana);
        cPane.add(btnCherry);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("line..");
        card.next(cPane);
    }
    public static void main(String[] args) {
        CH19_P05_cardLayout f = new CH19_P05_cardLayout();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
        f.setVisible(true);
                
    }
}
