import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;

public class HomepageGUI implements ActionListener{

    JFrame frame = new JFrame();
    // LoginGUI loginGUI = new LoginGUI();
    JPanel panel = new JPanel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();


        // LaunchPage LaunchPage = new LaunchPage();

    HomepageGUI(){




        panel.setBackground(Color.BLACK);
        panel.setBounds(0,0,800,100);
        panel.setPreferredSize(new Dimension(800, 600));
        

        button1.setBounds(275, 125, 250, 100);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button1.setText("Budget Shopping");
        button1.setBackground(Color.ORANGE);
        button1.setFocusable(false);
        button1.addActionListener((ActionListener) this);



        button2.setBounds(275, 250, 250, 100);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button2.setText("Product Shopping");
        button2.setBackground(Color.decode("#9EA8F"));

        button2.setFocusable(false);
        button2.addActionListener(this);



        button3.setBounds(275, 375, 250, 100);
        button3.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button3.setText("Admin Login");
        button3.setBackground(Color.decode("#B5FFFC"));
        button3.setFocusable(false);
        button3.addActionListener(this);


        

        frame.setBackground(Color.gray);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.getContentPane().setBackground(Color.decode("#8EC5FC"));
        frame.setVisible(true);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(panel, BorderLayout.NORTH);

        // frame.setLayout(new BorderLayout(10, 10));

        // frame.pack();



    }
    @Override
    public void actionPerformed(ActionEvent e) {

        
        if(e.getSource() == button1){
            // productGUI productpage = new productGUI();
            
        }


        if(e.getSource() == button2){
            productGUI productpage = new productGUI();
        }

        if(e.getSource() == button3){
            IDandPassword idandPasswords = new IDandPassword();
            LoginGUI loginPage = new LoginGUI(idandPasswords.getLoginInfo());
   
        }

    }

    
}