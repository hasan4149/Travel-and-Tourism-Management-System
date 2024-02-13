package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails, viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage,viewpackage,viewhotels,bookhotel,viewbookedhotel,destinations,calculators,notepad,about,deletedetails,payment;
    Dashboard(String username)  {
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 1, 0, 10)); // GridLayout with vertical arrangement
        
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel ();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel icon = new JLabel(i3);
	icon.setBounds(5, 0, 70, 70); 
        p1.add(icon);
        
        
        JLabel heading = new JLabel("Dashboard");
	heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
	heading.setBounds(80, 10, 300, 40);
	p1.add(heading);
        
        
        JPanel p2=new JPanel ();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,700);
        add(p2);
        
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 36);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0,30));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 36, 300, 36);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 72, 300, 36);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        
        deletedetails = new JButton("Delete Personal Details");
        deletedetails.setBounds(0, 108, 300, 36);
        deletedetails.setBackground(new Color(0,0,102));
        deletedetails.setForeground(Color.WHITE);
        deletedetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletedetails.setMargin(new Insets(0, 0, 0,40));
        deletedetails.addActionListener(this);
        p2.add(deletedetails);
        
        
        checkpackages = new JButton("Check Package");
        checkpackages.setBounds(0,144, 300, 36);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 180, 300, 36);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0, 0, 0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("View Package");
        viewpackage.setBounds(0, 216, 300, 36);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0, 0, 0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 252, 300, 36);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 288, 300, 36);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0, 0, 0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel = new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0, 324, 300, 36);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotel.setMargin(new Insets(0, 0, 0,70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0, 360, 300, 36);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0,125));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payment = new JButton("Payment");
        payment.setBounds(0, 396, 300, 36);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payment.setMargin(new Insets(0, 0, 0,155));
        payment.addActionListener(this);
        p2.add(payment);
        
        calculators = new JButton("Calculator");
        calculators.setBounds(0, 432, 300, 36);
        calculators.setBackground(new Color(0,0,102));
        calculators.setForeground(Color.WHITE);
        calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculators.setMargin(new Insets(0, 0, 0,145));
        calculators.addActionListener(this);
        p2.add(calculators);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 468, 300, 36);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0,175));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        
        about = new JButton("About");
        about.setBounds(0, 504, 300, 36);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0,155));
        about.addActionListener(this);
        p2.add(about);
        
        JScrollPane scrollPane = new JScrollPane(buttonPanel);
        scrollPane.setBounds(0, 65, 300, 900);
        add(scrollPane);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5); 
	JLabel image = new JLabel(i6);
	image.setBounds(0, 0, 1300, 700); 
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
	text.setForeground(Color.RED);
        text.setFont(new Font("RALEWAY", Font.PLAIN, 40));
	text.setBounds(400, 70, 1200, 70);
	image.add(text);
        
        
        
        
        
        
        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)  {
        if(ae.getSource() == addPersonalDetails)
        {
            new Addcustomer(username);
            
        } else if(ae.getSource()== viewPersonalDetails) {
            new ViewCustomer(username);

        } else if(ae.getSource()== updatePersonalDetails) {
            new UpdateCustomer(username);
            
        } else if(ae.getSource()== deletedetails) {
            new DeleteDetails(username);
        }   else if(ae.getSource()== checkpackages) {
            new CheckPackage();
        } else if(ae.getSource()== bookpackage) {
            new BookPackage(username);
        }   else if(ae.getSource()== viewpackage) {
            new ViewPackage(username);
        }   else if(ae.getSource()== viewhotels) {
            new CheckHotels();
        }   else if(ae.getSource()== destinations) {
            new Destinations();
        } else if(ae.getSource()== payment) {
//            setVisible(false);
//            new Payment1().setVisible(true);
            new Payment(username);
        }   else if(ae.getSource()== bookhotel) {
            new BookHotel(username);
        }   else if(ae.getSource()== viewbookedhotel) {
            new ViewBookedHotel(username);
        }   else if(ae.getSource()== calculators) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }   else if(ae.getSource()== notepad) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }   else if(ae.getSource()== about) {
            new About();
        } 
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
    
}

