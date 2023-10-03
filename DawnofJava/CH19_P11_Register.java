import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class CH19_P11_Register  extends JFrame {
    
    JPanel mainPanel;  
    JPanel middlePanel;    
    JPanel formPanel;
    JPanel menuPanel;

    JLabel lblUserName,lblUserEmail,lblUserPass,lblUserAddress,lblUserProgramming;
    JTextField txtUserName,txtUserEmail;
    JPasswordField pwdUserPass;
    JTextArea txtUserAddress;

    JCheckBox cbPython,cbJava,cbCpp,cbSharp;


    public CH19_P11_Register()
    {
        mainPanel = new JPanel();
        BorderLayout brl = new BorderLayout();

        brl.setVgap(100);
        // brl.setHgap(100);

        mainPanel.setLayout(brl);
        this.add(mainPanel);

        menuPanel = new JPanel();
        menuPanel.setLayout(new FlowLayout());
        menuPanel.add(new JLabel("Register here"));
        mainPanel.add(menuPanel,BorderLayout.NORTH);

        mainPanel.add(new JButton("sdfs"),BorderLayout.WEST);

        middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout());
        mainPanel.add(middlePanel,BorderLayout.CENTER);

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6,2));

        lblUserName = new JLabel("Enter User Name : ");
        lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);

        txtUserName = new JTextField();
        formPanel.add(lblUserName);        
        formPanel.add(txtUserName);


        lblUserEmail = new JLabel("Enter User Email : ");
        lblUserEmail.setHorizontalAlignment(SwingConstants.RIGHT);

        txtUserEmail = new JTextField();
        formPanel.add(lblUserEmail);       
        formPanel.add(txtUserEmail);

        lblUserPass = new JLabel("Enter User password : ");
        lblUserPass.setHorizontalAlignment(SwingConstants.RIGHT);

        pwdUserPass = new JPasswordField();
        formPanel.add(lblUserPass);
        formPanel.add(pwdUserPass);


        lblUserAddress = new JLabel("Enter User Address : ");
        lblUserAddress.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUserAddress = new JTextArea();
        formPanel.add(lblUserAddress);
        formPanel.add(txtUserAddress);


        lblUserProgramming = new JLabel("Programming");
        lblUserProgramming.setHorizontalAlignment(SwingConstants.RIGHT);

        cbPython = new JCheckBox("Python");        
        cbJava = new JCheckBox("Java");
        cbCpp = new JCheckBox("C++");
        cbSharp = new JCheckBox("C#");


        
        formPanel.add(lblUserProgramming);
        
        JPanel programming = new JPanel();
        programming.setLayout(new FlowLayout());
        programming.add(cbPython);
        programming.add(cbJava);
        programming.add(cbCpp);
        programming.add(cbSharp);
        

        
        formPanel.add(programming);


        middlePanel.add(formPanel);


    }
    public static void main(String[] args) {
        
        CH19_P11_Register f = new CH19_P11_Register();
        f.setSize(1920, 1080);
        f.setVisible(true);
        f.setTitle("Never Give Up");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
