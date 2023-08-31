import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class CH19_P01_Frame extends Frame {
    
    public CH19_P01_Frame(String s)
    {
        super(s);
    }
    public static void main(String[] args) {
        
        CH19_P01_Frame f = new CH19_P01_Frame("Kites");

        f.setSize(500, 350);

        f.setVisible(true);

        
        f.addWindowListener(new CloseWell());
    }
    
}

class CloseWell implements WindowListener{

    @Override
    public void windowActivated(WindowEvent e) {
        
        System.out.println("Hello Coder.. ");
        System.out.println("Unimplemented method 'windowActivated'");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
        System.out.println("Unimplemented method 'windowClosed'");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Unimplemented method 'windowClosing'");
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
        System.out.println("Unimplemented method 'windowDeactivated'");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
        System.out.println("Unimplemented method 'windowDeiconified'");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
        System.out.println("Unimplemented method 'windowIconified'");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
        System.out.println("Unimplemented method 'windowOpened'");
    }

}

