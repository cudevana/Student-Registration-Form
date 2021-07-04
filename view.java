import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

public class View extends JFrame {
    private JPanel contentPane;
//    private JTextField fname,lname,email,mobile,pin;
//    private JPasswordField password;
//    private JButton btnNewButton;
//    private String F,L,E,M,P,Pa;
//    private JLabel Fname,Lname,lblPIn,lblmobileNumber,Emailadd;

    public static void main(String[] args) {
                    View frame = new View("","","","","","");
                    frame.setVisible(true);
    }



    public View(String E,String Pa,String F,String L,String P,String M) {

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
        
        
//        try {
//        	ResultSet rs;
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micro", "postgres", "devana");
//
//            PreparedStatement pst = null;
//            
//
//            pst = connection.prepareStatement("SELECT * FROM Register;");
////            }
//            rs = pst.executeQuery();
//            while(rs.next())
//            {
//       	     E = rs.getString("email");
//    	    Pa = rs.getString("password");
//
//    	     if(Email.equals(email) && Password.equals(Pa)) {
//    	    	 F = rs.getString("email");
//    	    	 L = rs.getString("email");
//    	    	 P = rs.getString("email");
//    	    	 M = rs.getString("email");
//    	    	 Fname.setText("First Name :"+ F);
//    	    	 Lname.setText("Last Name :"+ L);
//    	    	 lblPIn.setText("Pin :"+ P);
//    	    	 lblmobileNumber.setText("Mobile :"+ M);
//    	    	 Emailadd.setText("Email :"+ F);
//
//
//    	    	 
//    	    	 
//    	    	 
////    	    	 Book booking=new Book(email);
////    	    	 booking.setVisible(true);
////    	    	 break;
//    	     }
//    	     else {
////    	    	 JOptionPane.showMessageDialog(btnNewButton, "account indakada");
//    	     }
//            }
//            connection.close();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        } 
//    
    


        JLabel Student = new JLabel("Student Details ");
        Student.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        Student.setBounds(362, 52, 400, 50);
        contentPane.add(Student);

        JLabel Fname = new JLabel("First Name:" + F);
        Fname.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Fname.setBounds(58, 152, 350, 43);
        contentPane.add(Fname);

        JLabel Lname = new JLabel("Last Name:" + L);
        Lname.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Lname.setBounds(58, 243, 350, 29);
        contentPane.add(Lname);

        JLabel Emailadd = new JLabel("Email :" +E);
        Emailadd.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Emailadd.setBounds(58, 324, 350, 36);
        contentPane.add(Emailadd);

        

        JLabel lblPIn = new JLabel("Pin Code:"+P);
        lblPIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPIn.setBounds(542, 159, 350, 29);
        contentPane.add(lblPIn);
//
//        JLabel Lpassword = new JLabel("Password");
//        Lpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        Lpassword.setBounds(542, 245, 99, 24);
//        contentPane.add(Lpassword);

        JLabel lblmobileNumber = new JLabel(M);
        lblmobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblmobileNumber.setBounds(542, 239, 200, 26);
        contentPane.add(lblmobileNumber);

       
//        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
//        btnNewButton.setBounds(399, 447, 259, 74);
//        contentPane.add(btnNewButton);
        

    }
}
