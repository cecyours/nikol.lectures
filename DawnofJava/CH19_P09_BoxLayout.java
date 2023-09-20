import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class CH19_P09_BoxLayout extends Frame {
    
    Button b[];
    public CH19_P09_BoxLayout(){

        b = new Button[10];

        for(int i=0;i<10;i++)
        {
            b[i] = new Button("Btn "+(i+1));
            this.add(b[i]);
        
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }
    public static void main(String[] args) {
        
        CH19_P09_BoxLayout f = new CH19_P09_BoxLayout();
        f.setTitle("Kali Linux");
        f.setSize(400,400);    
        f.setVisible(true);
        f.addWindowListener(new WindowListener() {

            @Override
            public void windowActivated(WindowEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("Unimplemented method 'windowActivated'");
            }

            @Override
            public void windowClosed(WindowEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("Unimplemented method 'windowClosed'");
            }

            @Override
            public void windowClosing(WindowEvent arg0) {

                f.dispose();
                     }

            @Override
            public void windowDeactivated(WindowEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("Unimplemented method 'windowDeactivated'");
            }

            @Override
            public void windowDeiconified(WindowEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("Unimplemented method 'windowDeiconified'");
            }

            @Override
            public void windowIconified(WindowEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("Unimplemented method 'windowIconified'");
            }

            @Override
            public void windowOpened(WindowEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("Unimplemented method 'windowOpened'");
            }
            
        });
    }
}
