import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class dairyProduct extends productGUI1{

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton milkButton = new JButton("Milk    Rs 30");
    JButton EggsButton = new JButton("Eggs  Rs 5");
    JButton cheeseButton = new JButton("Cheese    Rs 50");


    dairyProduct(){

      label.setText("Dairy Product");
      label.setVisible(true);
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setVerticalTextPosition(JLabel.TOP);
      label.setIconTextGap(10);
      label.setFont(new Font("MV Boli", Font.PLAIN, 20));
      label.setVerticalAlignment(JLabel.TOP);
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setBounds(85,0,300, 100);   


      milkButton.setBounds(150, 100, 150, 50);
      milkButton.addActionListener(this);

        
      EggsButton.setBounds(150, 175 , 150, 50);
      EggsButton.addActionListener(this);

        
      cheeseButton.setBounds(150, 250, 150, 50);
      cheeseButton.addActionListener(this);
      // cheeseButton.setVerticalAlignment(JRadioButton.BOTTOM);


        
        frame.add(label);
        frame.add(milkButton);
        frame.add(EggsButton);
        frame.add(cheeseButton);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setLayout(null);

    }


}