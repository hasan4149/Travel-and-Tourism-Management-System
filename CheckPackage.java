package travel.management.system;

import javax.swing.*;
import java.awt.*;


public class CheckPackage extends JFrame{
    
    CheckPackage() {
        setBounds(300,50,900,600);
        
        
        String[] package1= {"GOLD PACKAGE","4 Days and 3 Nights","Airport Assistance","Welcome Drinks On Arrival","Daily Buffet","Half Day City Tour","Jaflong Tour","Sadapathor and Bichnakandi Tour","Sreemangal Tour","Book Now","Summer Special","BDT 10000/-","package1.jpg"};
        String[] package2= {"SILVER PACKAGE","3 Days and 2 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Welcome Drinks On Arrival","Jaflong Tour","Sadapathor Tour","Bichnakandi Tour","Book Now","Summer Special","BDT 7000/-","package2.jpg"};
        String[] package3= {"BRONZE PACKAGE","3 Days and 2 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Welcome Drinks On Arrival","Jaflong Tour","Sadapathor Tour","Bichnakandi Tour","Book Now","Winter Special","BDT 5000/-","package3.jpg"};
    
    

        
        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1",null,p1 );
        
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2",null,p2 );
        
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3",null,p3 );
        
        add(tab);
        
        

        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel ("GOLD PACKAGE");
        l1.setBounds(30, 5, 300, 30);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        l1.setForeground(Color.GREEN);
        p1.add(l1);
        
        JLabel l2 = new JLabel ("4 Days and 3 Nights");
        l2.setBounds(30, 60, 300, 30);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        l2.setForeground(Color.RED);
        p1.add(l2);
        
        JLabel l3 = new JLabel ("Airport Assistance");
        l3.setBounds(30, 110, 300, 30);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        l3.setForeground(Color.BLACK);
        p1.add(l3);
        
        JLabel l4 = new JLabel ("Welcome Drinks On Arrival");
        l4.setBounds(30, 160, 300, 30);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        l4.setForeground(Color.BLACK);
        p1.add(l4);
        
        JLabel l5 = new JLabel ("Daily Buffet");
        l5.setBounds(30, 210, 300, 30);
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        l5.setForeground(Color.BLACK);
        p1.add(l5);
        
        JLabel l6 = new JLabel ("Half Day City Tour");
        l6.setBounds(30, 260, 300, 30);
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        l6.setForeground(Color.BLACK);
        p1.add(l6);
        
        
        JLabel l7 = new JLabel ("Jaflong Tour");
        l7.setBounds(30, 310, 300, 30);
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        l7.setForeground(Color.BLACK);
        p1.add(l7);
        
        JLabel l8 = new JLabel ("Sadapathor and Bichnakandi Tour");
        l8.setBounds(30, 360, 350, 30);
        l8.setFont(new Font("Tahoma",Font.BOLD,20));
        l8.setForeground(Color.BLACK);
        p1.add(l8);
        
        
        JLabel l9 = new JLabel ("Sreemangal Tour");
        l9.setBounds(30, 410, 300, 30);
        l9.setFont(new Font("Tahoma",Font.BOLD,20));
        l9.setForeground(Color.BLACK);
        p1.add(l9);
        
        
        JLabel l10 = new JLabel ("Book Now");
        l10.setBounds(60, 450, 300, 30);
        l10.setFont(new Font("Tahoma",Font.BOLD,25));
        l10.setForeground(Color.BLUE);
        p1.add(l10);
        
        
        JLabel l11 = new JLabel ("Summer Special");
        l11.setBounds(80, 500, 300, 30);
        l11.setFont(new Font("Tahoma",Font.BOLD,25));
        l11.setForeground(Color.RED);
        p1.add(l11);
        
        
        JLabel l12 = new JLabel ("BDT 10000/-");
        l12.setBounds(500, 500, 300, 30);
        l12.setFont(new Font("Tahoma",Font.BOLD,25));
        l12.setForeground(Color.BLACK);
        p1.add(l12);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l13 = new JLabel(i3);
        l13.setBounds(350, 20,500, 300);
        p1.add(l13);
        
        
        
        tab.addTab("Package 1",null,p1 );
        tab.addTab("Package 2",null,p2 );
        tab.addTab("Package 3",null,p3 );
        
        
        add(tab);
        
        
        
        setVisible(true);
    }
    
    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel (pack[0]);
        l1.setBounds(30, 5, 300, 30);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        l1.setForeground(Color.GREEN);
        p1.add(l1);
        
        JLabel l2 = new JLabel (pack[1]);
        l2.setBounds(30, 60, 300, 30);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        l2.setForeground(Color.BLACK);
        p1.add(l2);
        
        JLabel l3 = new JLabel (pack[2]);
        l3.setBounds(30, 110, 300, 30);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        l3.setForeground(Color.BLACK);
        p1.add(l3);
        
        JLabel l4 = new JLabel (pack[3]);
        l4.setBounds(30, 160, 300, 30);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        l4.setForeground(Color.BLACK);
        p1.add(l4);
        
        JLabel l5 = new JLabel (pack[4]);
        l5.setBounds(30, 210, 300, 30);
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        l5.setForeground(Color.BLACK);
        p1.add(l5);
        
        JLabel l6 = new JLabel (pack[5]);
        l6.setBounds(30, 260, 300, 30);
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        l6.setForeground(Color.BLACK);
        p1.add(l6);
        
        
        JLabel l7 = new JLabel (pack[6]);
        l7.setBounds(30, 310, 300, 30);
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        l7.setForeground(Color.BLACK);
        p1.add(l7);
        
        JLabel l8 = new JLabel (pack[7]);
        l8.setBounds(30, 360, 350, 30);
        l8.setFont(new Font("Tahoma",Font.BOLD,20));
        l8.setForeground(Color.BLACK);
        p1.add(l8);
        
        
        JLabel l9 = new JLabel (pack[8]);
        l9.setBounds(30, 410, 300, 30);
        l9.setFont(new Font("Tahoma",Font.BOLD,20));
        l9.setForeground(Color.BLACK);
        p1.add(l9);
        
        
        JLabel l10 = new JLabel (pack[9]);
        l10.setBounds(60, 450, 300, 30);
        l10.setFont(new Font("Tahoma",Font.BOLD,25));
        l10.setForeground(Color.CYAN);
        p1.add(l10);
        
        
        JLabel l11 = new JLabel (pack[10]);
        l11.setBounds(80, 500, 300, 30);
        l11.setFont(new Font("Tahoma",Font.BOLD,25));
        l11.setForeground(Color.BLUE);
        p1.add(l11);
        
        
        JLabel l12 = new JLabel (pack[11]);
        l12.setBounds(500, 500, 300, 30);
        l12.setFont(new Font("Tahoma",Font.BOLD,25));
        l12.setForeground(Color.RED);
        p1.add(l12);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[12]));
        Image i2 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l13 = new JLabel(i3);
        l13.setBounds(350, 20,500, 300);
        p1.add(l13);
        
        return p1;
        
    }
    
    public static void main(String[] args) {
        new CheckPackage();
    }
    
}
