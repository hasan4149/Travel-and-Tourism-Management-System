package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Payment extends JFrame implements ActionListener {
    JButton  back, pay;
    JTextField tftransaction;
    JLabel transaction,labelusername;
    
    public Payment(String username) {
        setBounds(350, 100, 800, 600);
        setLayout(null);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblusername.setBounds(160, 200, 100, 20);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelusername.setBounds(260, 200, 100, 20);
        add(labelusername);
        
        
        JLabel lbltransaction = new JLabel("Transaction Id");
        lbltransaction.setBounds(160, 230, 200, 25);
        lbltransaction.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(lbltransaction);
        
        JLabel labeltransaction = new JLabel(); // Initialize the label
        labeltransaction.setBounds(360, 230, 200, 25);
        add(labeltransaction);

        tftransaction = new JTextField();
        tftransaction.setBounds(160, 260, 300, 30);
        tftransaction.setBorder(BorderFactory.createEmptyBorder());
        add(tftransaction);
        
        try {
                Conn conn =new Conn();
                String query ="Select * from account where username='"+username+"'";
                ResultSet rs =conn.s.executeQuery(query);
                while(rs.next()){
                    labelusername.setText(rs.getString("username"));
                        
                }
                
        }   catch (Exception e) {
               e.printStackTrace();
            }

        pay = new JButton("Pay");
        pay.setBounds(180, 350, 80, 40);
        pay.addActionListener(this);
        add(pay);

        back = new JButton("Back");
        back.setBounds(300, 350, 80, 40);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    
    
public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == pay) {
        String transactionid = tftransaction.getText();
        
        try {
            Conn c = new Conn();
//            String query = "insert into transaction values('"+labeltransactionid.getText()+"')");
//            c.s.executeUpdate(query);
            c.s.executeUpdate("insert into transaction1 values('"+labelusername.getText()+"','"+ tftransaction.getText()+"')");
            JOptionPane.showMessageDialog(null, "Payment Successful");
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        setVisible(false);
    }
}


    public static void main(String[] args) {
        new Payment("");
    }
}
