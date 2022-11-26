
import javax.swing.*;  
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admingui implements ActionListener{


    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon();

    JLabel label = new JLabel("Retail Store Helper");
    JLabel label1 = new JLabel("Store Name");
    JLabel label2 = new JLabel("Admin Login");


    JButton b1 = new JButton("INSERTION"); 
    JButton b2 = new JButton("DELETION");
    JButton b3 = new JButton("PRODUCT ANALYSIS");


    ImageIcon logo = new ImageIcon("logo.png");




    admingui(){
        // image = new ImageIcon(this.getClass().getResource("new.png"));
    
            label.setHorizontalTextPosition(JLabel.LEFT);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setFont(new Font(null, Font.ITALIC, 18));
            label.setIconTextGap(10);
            label.setVerticalAlignment(JLabel.TOP);
            label.setBounds(0,0,250,100);
    
            label1.setHorizontalTextPosition(JLabel.RIGHT);
            label1.setVerticalTextPosition(JLabel.TOP);
            label1.setFont(new Font(null, Font.ITALIC, 18));
            label1.setIconTextGap(60);
            label1.setVerticalAlignment(JLabel.TOP);
            label1.setBounds(450,0,150,150);
    
            label2.setHorizontalTextPosition(JLabel.RIGHT);
            label2.setVerticalTextPosition(JLabel.TOP);
            label2.setFont(new Font(null, Font.ITALIC, 18));
            label2.setIconTextGap(60);
            label2.setVerticalAlignment(JLabel.TOP);
            label2.setBounds(580,0,150,150);
            
            b1.setFont(new Font(null, Font.ITALIC, 12)); 
            b1.setBounds(260,250,170,20);  
            b1.setFocusable(false);
            b1.addActionListener(this);
    
            b2.setFont(new Font(null, Font.ITALIC,12));  
            b2.setBounds(260,275,170,20);
            b2.setFocusable(false);
            b2.addActionListener(this);

    
            b3.setFont(new Font(null, Font.ITALIC, 12));  
            b3.setBounds(260,300,170,20);  
            b3.setFocusable(false);
            b3.addActionListener((ActionListener) this);
    
            frame.add(label);
            frame.add(label1);
            frame.add(label2);
            frame.add(b1);
            frame.add(b2);
            // frame.add(b3);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(700,450);
            frame.setTitle("OYC");
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            frame.setIconImage(logo.getImage());
    
            frame.getContentPane().setBackground(Color.lightGray);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
                
    }
    
}