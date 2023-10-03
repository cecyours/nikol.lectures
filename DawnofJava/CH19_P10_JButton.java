import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class CH19_P10_JButton extends JFrame {

    JButton btn;
        boolean f = false;

    public CH19_P10_JButton() {

        this.setLayout(null);

        btn = new JButton(new ImageIcon("./icon.png"));
        btn.setBounds(100, 100, 100, 50);
        this.add(btn);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("I clicked by you...");
                if (f) {
                    btn.setBackground(Color.RED);
                    // btn.setText("RED");
                    btn.setForeground(Color.white);
                    btn.setIcon(new ImageIcon("./icon.png"));
                    btn.setBounds(100, 100, 300, 300);
                    // btn.setBorder();
                    f = false;
                } else {
                    btn.setBackground(Color.GREEN);
                    // btn.setText("GREEN");
                    btn.setForeground(Color.BLACK);
                    btn.setIcon(new ImageIcon("./mario.png"));                  
                      btn.setBounds(50, 50, 150, 150);



                    f= true;

                }
            }

        });
    }

    public static void main(String[] args) {

        CH19_P10_JButton f = new CH19_P10_JButton();
        f.setSize(500, 350);
        f.setVisible(true);
        f.setTitle("Never Give Up");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
