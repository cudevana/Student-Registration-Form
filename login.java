import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

public class Login extends JFrame {
    private JPanel contentPane;
    private JTextField email;
    private JPasswordField passwordField;
    private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
                    Login frame = new Login();
                    frame.setVisible(true);
    }


    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Login");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);



        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 152, 124, 36);
        contentPane.add(lblEmailAddress);




        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 151, 316, 50);
        contentPane.add(email);
        email.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(58, 243, 110, 29);
        contentPane.add(lblPassword);


        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(214, 235, 316, 50);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emailId = email.getText();
                String password = passwordField.getText();
                String email,password1,f,l,p,m;


                try {
                	ResultSet rs;
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micro", "postgres", "devana");

                    PreparedStatement pst = null;
                    

                    pst = connection.prepareStatement("SELECT * FROM Register;");
//                    }
                    rs = pst.executeQuery();
                    while(rs.next())
                    {
               	     email = rs.getString("email");
            	     password1 = rs.getString("password");
            	     f = rs.getString("fname");
            	     l = rs.getString("lname");
            	     p = rs.getString("pin");
            	     m = rs.getString("mobile");
            	     
            	     
    
            	     if(emailId.equals(email) && password.equals(password1)) {
            	    	 JOptionPane.showMessageDialog(btnNewButton, "Welcome");
            	    	 dispose();
            	    	 View booking=new View(email,password,f,l,p,m);
            	    	 booking.setVisible(true);
            	    	 break;
            	     }
            	     else {
//            	    	 JOptionPane.showMessageDialog(btnNewButton, "account indakada");
            	     }
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(214, 447, 259, 74);
        contentPane.add(btnNewButton);
        
    }
}
