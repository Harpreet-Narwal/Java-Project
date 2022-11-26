import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.*;
import java.awt.*;
public class productGUI implements java.awt.event.ActionListener{


        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Products Category");
        JPanel panel = new JPanel();
        JRadioButton breadsButton;
        JRadioButton dairyButton ;
        JRadioButton vegeButton;


    productGUI(){

        

        breadsButton = new JRadioButton("Bread & bread spreads");
        dairyButton = new JRadioButton("Dairy");
        vegeButton = new JRadioButton("Vegetables and Fruits");
        



        breadsButton.addActionListener(this);
        breadsButton.setBounds(150, 150, 75, 25);
        breadsButton.setVisible(true);
        
        
        dairyButton.addActionListener(this);
        dairyButton.setBounds(150, 225, 75, 25);
        dairyButton.setVisible(true);

        
        vegeButton.addActionListener(this);
        vegeButton.setBounds(150, 300, 75, 25);
        vegeButton.setVisible(true);


        ButtonGroup group = new ButtonGroup();
        group.add(breadsButton);
        group.add(dairyButton);
        group.add(vegeButton);


        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setFont(new Font(null, Font.ITALIC, 18));
        // label1.setIconTextGap(10);
        // label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setBounds(0,0,250,100);

        // panel.add(label1);

        frame.add(label1);
        frame.add(breadsButton);
        frame.add(dairyButton);
        frame.add(vegeButton);
        frame.setSize(400, 250);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setLayout(null);
        frame.pack();

    }

    /**
     * InnerproductGUI
     */





    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == breadsButton){
            System.out.println("Hi");
        }
        else if(e.getSource() == dairyButton){
            InnerproductGUI innerproductgui = new InnerproductGUI();
            System.out.println("Poo");

        }
        else if(e.getSource() == vegeButton){
            System.out.println("Hi Pa");

        }
   
    }

}


class InnerproductGUI implements ActionListener {
        
    InnerproductGUI(){
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}







