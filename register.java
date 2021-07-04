import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

public class Register extends JFrame {
    private JPanel contentPane;
    private JTextField fname,lname,email,mobile,adh,pin;
    private JPasswordField password;
    private JButton btnNewButton;

    public static void main(String[] args) {
                    Register frame = new Register();
                    frame.setVisible(true);
    }



    public Register() {

    /**
     * Create the frame.
     */

//        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(true);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel PIn = new JLabel("Student Register From ");
        PIn.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        PIn.setBounds(362, 52, 400, 50);
        contentPane.add(PIn);

        JLabel Fname = new JLabel("First name");
        Fname.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Fname.setBounds(58, 152, 99, 43);
        contentPane.add(Fname);

        JLabel Lname = new JLabel("Last name");
        Lname.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Lname.setBounds(58, 243, 110, 29);
        contentPane.add(Lname);

        JLabel Emailadd = new JLabel("Email\r\n address");
        Emailadd.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Emailadd.setBounds(58, 324, 124, 36);
        contentPane.add(Emailadd);

        fname = new JTextField();
        fname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        fname.setBounds(214, 151, 228, 50);
        contentPane.add(fname);
        fname.setColumns(10);
        
        lname = new JTextField();
        lname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lname.setBounds(214, 235, 228, 50);
        contentPane.add(lname);
        lname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        
        
//        email.setColumns(10);

        pin = new JTextField();
        pin.setFont(new Font("Tahoma", Font.PLAIN, 32));
        pin.setBounds(707, 151, 228, 50);
        contentPane.add(pin);


        JLabel lblPIn = new JLabel("Pin");
        lblPIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPIn.setBounds(542, 159, 99, 29);
        contentPane.add(lblPIn);

        JLabel Lpassword = new JLabel("Password");
        Lpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Lpassword.setBounds(542, 245, 99, 24);
        contentPane.add(Lpassword);

        JLabel lblmobileileNumber = new JLabel("Mobile");
        lblmobileileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblmobileileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblmobileileNumber);

        mobile = new JTextField();
        mobile.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mobile.setBounds(707, 320, 228, 50);
        contentPane.add(mobile);
        mobile.setColumns(10);

        password= new JPasswordField();
        password.setFont(new Font("Tahoma", Font.PLAIN, 32));
        password.setBounds(707, 235, 228, 50);
        contentPane.add(password);

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fName = fname.getText();
                String lName = lname.getText();
                String emailId = email.getText();
                String pincode=pin.getText();
                String mobileNumber = mobile.getText();
                String Password = password.getText();

                String msg = "" + fName;
                msg += " \n";

                try {
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micro", "postgres", "devana");

                    String query = "INSERT INTO Register values('" + fName + "','" + lName + "','"  +
                        Password + "','"+pincode+"','" + emailId + "','" + mobileNumber + "')";
                    

                    Statement sta = connection.createStatement();
                    sta.executeUpdate(query);

                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                        dispose();
                        Login login=new Login();
                        login.setVisible(true);
                    
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);
    }
}
