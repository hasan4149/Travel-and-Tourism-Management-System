package travel.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import java.sql.*;
//import java.awt.event.*;
//
//public class AdminPanel extends JFrame implements ActionListener {
//    JButton back;
//    JLabel labeltransaction,labelusername;
//    JTextField tfusername;
//    
//    public AdminPanel(String username) {
//        setBounds(300, 75, 870, 625);
//        setLayout(null);
//        getContentPane().setBackground(Color.WHITE);
//
//        JLabel lbltransaction = new JLabel("Transaction Id");
//        lbltransaction.setBounds(160, 230, 200, 25);
//        lbltransaction.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
//        add(lbltransaction);
//        
//        JLabel labeltransaction = new JLabel(); // Initialize the label
//        labeltransaction.setBounds(230, 230, 200, 25);
//        add(labeltransaction);
//        
//        JLabel lblusername = new JLabel("Username");
//        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        lblusername.setBounds(160, 150, 150, 25);
//        add(lblusername);
//
//        tfusername = new JTextField();
//        tfusername.setBounds(360, 150, 300, 30);
//        tfusername.setBorder(BorderFactory.createEmptyBorder());
//        add(tfusername);
//        
//        
//        try {
//                Conn conn =new Conn();
//                String query ="Select * from account where username='"+username+"'";
//                ResultSet rs =conn.s.executeQuery(query);
//                while(rs.next()){
//                    labeltransaction.setText(rs.getString("transactionid"));
//                    
//                   
//                    
//                }
//                
//        }   catch (Exception e) {
//               e.printStackTrace();
//            }
//
//        back = new JButton("Back");
//        back.setBounds(350, 350, 100, 25);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.addActionListener(this);
//        add(back);
//
//        
//
//        try {
//            Conn conn = new Conn();
////            String transactionId = tftransaction.getText();
//
////            String query ="Select * from transaction where transactionid='transactionid'";
////            ResultSet rs =conn.s.executeQuery(query);
//
//
//
//
//            ResultSet rs = conn.s.executeQuery("Select * from transaction1 where username ='"+username+"'");
//            while (rs.next()) {
////                labeltransaction.setText(rs.getString("username"));
//                labeltransaction.setText(rs.getString("transactionid"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } 
//
//
//
//           
//
//            
//
//
//
//
//
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == back) {
//            setVisible(false); // Close the AdminPanel frame
//            // Add logic to go back to the previous page
//            // For example: Navigate to the previous page using a new instance of that page
//        }
//    }
//
//    public static void main(String[] args) {
//        new AdminPanel("");
//    }
//}



//import javax.swing.*;
//import java.awt.*;
//import java.sql.*;
//import java.awt.event.*;
//
//public class AdminPanel extends JFrame implements ActionListener{
//    JButton back;
//    JLabel labelTransactionId, labelUsername;
//
//    public AdminPanel(String username) {
//        setBounds(300, 75, 870, 625);
//        setLayout(null);
//        getContentPane().setBackground(Color.WHITE);
//
//        labelTransactionId = new JLabel("Transaction Id");
//        labelTransactionId.setBounds(160, 230, 200, 25);
//        labelTransactionId.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
//        add(labelTransactionId);
//
//        // Initialize the label
//        JLabel labelTransaction = new JLabel();
//        labelTransaction.setBounds(230, 230, 200, 25);
//        add(labelTransaction);
//
//        labelUsername = new JLabel("Username");
//        labelUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        labelUsername.setBounds(160, 150, 150, 25);
//        add(labelUsername);
//
//        try {
//            Conn c = new Conn();
//            String query = "SELECT * FROM transaction1 WHERE username='" + username + "'";
//            ResultSet rs = c.s.executeQuery(query);
//            while (rs.next()) {
//                labelTransaction.setText(rs.getString("transactionid"));
//            }
//            setVisible(false);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        back = new JButton("Back");
//        back.setBounds(350, 350, 100, 25);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.addActionListener(this);
//        add(back);
//
//        setVisible(true);
//    }
//    public void actionPerformed(ActionEvent ae) {
//    // Add your action handling code here
//    if (ae.getSource() == back) {
//        
//        setVisible(false);
//    }
//}
//
//    public static void main(String[] args) {
//        new AdminPanel("");
//    }
//}




import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class AdminPanel extends JFrame implements ActionListener {
    JButton back;
    JLabel labelTransaction, labelusername;
    JTextField tfusername;

    public AdminPanel(String username) {
        setBounds(300, 75, 870, 625);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblTransaction = new JLabel("Transaction Id");
        lblTransaction.setBounds(160, 230, 200, 25);
        lblTransaction.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(lblTransaction);

        labelTransaction = new JLabel();
        labelTransaction.setBounds(230, 230, 200, 25);
        add(labelTransaction);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(160, 150, 150, 25);
        add(lblUsername);

        tfusername = new JTextField();
        tfusername.setBounds(360, 150, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        add(tfusername);
        tfusername.setEditable(false); // Make it uneditable

        try {
            Conn conn = new Conn();
            String query = "Select * from account where username='" + username + "'";
            ResultSet rs = conn.s.executeQuery(query);
            while (rs.next()) {
                tfusername.setText(rs.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setBounds(350, 350, 100, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("Select * from transaction1 where username ='" + username + "'");
            StringBuilder transactions = new StringBuilder(); // String to hold all transactions
            while (rs.next()) {
                transactions.append(rs.getString("transactionid")).append(", "); // Append each transaction ID
            }
            // Set the text of labelTransaction with all transactions
            labelTransaction.setText(transactions.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false); // Close the AdminPanel frame
            // Add logic to go back to the previous page
            // For example: Navigate to the previous page using a new instance of that page
        }
    }

    public static void main(String[] args) {
        new AdminPanel("");
    }
}


