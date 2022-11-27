import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class breadProducts implements ActionListener{

    JFrame frame = new JFrame();    
    JLabel label = new JLabel();

    JButton pbButton = new JButton("Peanut Butter      Rs 30");
    JButton breadButton = new JButton("Bread      Rs 15");
    JButton bunsButton = new JButton("Buns     Rs 5");

    


    breadProducts(){

        label.setText("Breads & Bread Speaders");
        label.setVisible(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(10);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(115,0,300, 100);        



        pbButton.setBounds(150, 100, 200, 75);
        pbButton.addActionListener(this);
      
        
        breadButton.setBounds(150, 200, 200, 75);
        breadButton.addActionListener(this);

        
        bunsButton.setBounds(150, 300, 200, 75);
        bunsButton.addActionListener(this);



        frame.add(label);
        frame.add(pbButton);
        frame.add(breadButton);
        frame.add(bunsButton);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

    }


}