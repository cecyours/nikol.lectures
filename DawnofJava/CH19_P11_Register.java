import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.GridLayout;

import javax.swing.*;

public class CH19_P11_Register extends JFrame {

    JPanel mainPanel;
    JPanel middlePanel;
    JPanel formPanel;
    JPanel menuPanel;

    JLabel lblUserName, lblUserEmail, lblUserPass, lblUserAddress, lblUserProgramming, lblUserRole,
            lblUserQualification, lblUserCourse;
    JTextField txtUserName, txtUserEmail;
    JPasswordField pwdUserPass;
    JTextArea txtUserAddress;

    JCheckBox cbPython, cbJava, cbCpp, cbSharp;

    JRadioButton rbProgrammer, rbCoder, rbLearner;
    ButtonGroup grpRole;

    JComboBox cmbUserQualification;

    JList lstUserCourse;

    JButton btnSubmit;

    public CH19_P11_Register() {
        mainPanel = new JPanel();
        BorderLayout brl = new BorderLayout();

        brl.setVgap(100);
        // brl.setHgap(100);

        mainPanel.setLayout(brl);
        this.add(mainPanel);

        menuPanel = new JPanel();
        menuPanel.setLayout(new FlowLayout());
        menuPanel.add(new JLabel("Register here"));

        mainPanel.add(menuPanel, BorderLayout.NORTH);

        mainPanel.add(new JButton("sdfs"), BorderLayout.WEST);

        middlePanel = new JPanel();

        middlePanel.setLayout(new FlowLayout());
        mainPanel.add(middlePanel, BorderLayout.CENTER);

        formPanel = new JPanel();
        GridLayout layout = new GridLayout(8, 2);
        layout.setHgap(10);
        layout.setVgap(10);
        formPanel.setLayout(layout);

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

        String data[] = { "B.Tech", "MBA", "B.COM" };
        cmbUserQualification = new JComboBox(data);
        formPanel.add(cmbUserQualification);

        // lblUserCourse = new JLabel("Enter course : ");
        // lblUserCourse.setHorizontalAlignment(SwingConstants.RIGHT);
        // formPanel.add(lblUserCourse);

        // String list[] = {"Noob Programmer","Extra Bug","Lazy Programmer"};
        // lstUserCourse = new JList<>(list);
        // lstUserCourse.setVisibleRowCount(1);

        // lstUserCourse.setLayoutOrientation(JList.VERTICAL);

        // formPanel.add(lstUserCourse);

        btnSubmit = new JButton("Submit");
        formPanel.add(btnSubmit, BorderLayout.SOUTH);
        middlePanel.add(formPanel);

        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                action();
            }

        });

    }

    public void action() {

        System.out.println("UserName : " + txtUserName.getText());
        System.out.println("UserPass : " + pwdUserPass.getText());
        System.out.println("UserEmail : " + txtUserEmail.getText());
        System.out.println("address : " + txtUserAddress.getText());

        ArrayList<String> progs = new ArrayList<String>();
        
        if(cbCpp.isSelected())
        {
            progs.add(cbCpp.getText());
        }
        if(cbJava.isSelected())
        {
            progs.add(cbJava.getText());
        }
        if(cbPython.isSelected())
        {
            progs.add(cbPython.getText());
        }
         if(cbSharp.isSelected())
        {
            progs.add(cbSharp.getText());
        }
        for(String s:progs)
        {
            System.out.println("selected language : "+s);
        }
        System.out.println("role : " + txtUserName.getText());
        System.out.println("qualification : " + cmbUserQualification.getSelectedItem());
    }

    public static void main(String[] args) {

        CH19_P11_Register f = new CH19_P11_Register();
        f.setSize(800, 550);
        f.setVisible(true);
        f.setTitle("Never Give Up");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
