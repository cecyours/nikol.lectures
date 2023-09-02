import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CH19_P04_draw extends Frame {

    public void paint(Graphics g) {
        // System.out.println("life cyl....");
        this.setBackground(Color.BLACK);
        g.setColor(Color.WHITE);

        g.fillRect(50, 190, 90, 160);

        g.setColor(Color.BLACK);
        for (int i = 1; i <= 5; i++) {
            g.fillRect(60, 200+i*30, 25, 15);             
            g.fillRect(105, 200+i*30, 25, 15); 


        }

        g.setColor(Color.white);
        g.fillOval(50, 100, 20, 20);

    }

    public static void main(String[] args) {

        CH19_P04_draw f = new CH19_P04_draw();
        f.setSize(500, 350);
        f.setTitle("kites are flying..");
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.out.println("Kites");
            }
        });
    }
}
