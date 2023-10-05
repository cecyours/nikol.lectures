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

    JLabel lblUserName,lblUserEmail,lblUserPass,lblUserAddress,lblUserProgramming,lblUserRole,lblUserQualification,lblUserCourse;
    JTextField txtUserName,txtUserEmail;
    JPasswordField pwdUserPass;
    JTextArea txtUserAddress;

    JCheckBox cbPython,cbJava,cbCpp,cbSharp;

    JRadioButton rbProgrammer,rbCoder, rbLearner;
    ButtonGroup grpRole;

    JComboBox cmbUserQualification;

    JList lstUserCourse;

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
        formPanel.setLayout(new GridLayout(8,2));

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
        cbPython.setSelected(true);        
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

        // TODO : 4th Oct 2023
        lblUserRole = new JLabel("Select Role : ");
        lblUserRole.setHorizontalAlignment(SwingConstants.RIGHT);
        formPanel.add(lblUserRole);
        
        rbProgrammer = new JRadioButton("Programming");
        rbProgrammer.setSelected(true);
        rbCoder = new JRadioButton("Coder");
        rbLearner = new JRadioButton("Learner");
        
        grpRole = new ButtonGroup();
        grpRole.add(rbProgrammer);
        grpRole.add(rbCoder);
        grpRole.add(rbLearner);

        JPanel role = new JPanel();
        role.setLayout(new FlowLayout());

        role.add(rbProgrammer);
        role.add(rbCoder);
        role.add(rbLearner);


        formPanel.add(role);

        lblUserQualification = new JLabel("Select your Qualification : ");
        lblUserQualification.setHorizontalAlignment(SwingConstants.RIGHT);
        formPanel.add(lblUserQualification);

        String data[] = {"B.Tech","MBA","B.COM"};
        cmbUserQualification = new JComboBox(data);
        formPanel.add(cmbUserQualification);


        lblUserCourse = new JLabel("Enter course : ");
        lblUserCourse.setHorizontalAlignment(SwingConstants.RIGHT);
        formPanel.add(lblUserCourse);

        String list[] = {"Noob Programmer","Extra Bug","Lazy Programmer"};
        lstUserCourse = new JList<>();
        lstUserCourse.setVisibleRowCount(10);
        
        formPanel.add(lstUserCourse);

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
