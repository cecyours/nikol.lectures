import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH19_P07_GridLayoyt extends JFrame {

    JPanel panel;

    public CH19_P07_GridLayoyt() {

        panel = new JPanel();

        panel.setLayout(new GridLayout(2, 4));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));    


        this.add(panel);
    }

    public static void main(String[] args) {

            CH19_P07_GridLayoyt kites = new CH19_P07_GridLayoyt();
            kites.setTitle("Demons");
            kites.setSize(500, 350);
            kites.setVisible(true);
            kites.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
