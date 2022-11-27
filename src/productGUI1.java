import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.*;
import java.awt.*;
public class productGUI1 extends JFrame implements java.awt.event.ActionListener{


        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Products Category");
        JPanel panel = new JPanel();
        JRadioButton breadsButton;
        JRadioButton dairyButton;
        JRadioButton vegeButton;

        
    productGUI1(){

        

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
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setBounds(0,0,250,100);

        panel.add(label1);

        this.add(panel);
        this.add(breadsButton);
        this.add(dairyButton);
        this.add(vegeButton);
        this.setSize(400, 250);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setLayout(null);
        // this.pack();
    }


    // public void dairyproduct(){



    //     JLabel label2 = new JLabel("Dairy Products");
    //     JPanel panel1 = new JPanel();
    //     JRadioButton milkButton;
    //     JRadioButton EggsButton ;
    //     JRadioButton cheeseButton;
        


    //     dairyproduct();
    //     {
    //         milkButton = new JRadioButton("Milk");
    //         EggsButton = new JRadioButton("Eggs");
    //         cheeseButton = new JRadioButton("Cheese");
            
    
    
    
    //         milkButton.addActionListener(this);
    //         milkButton.setBounds(150, 150, 75, 25);
    //         milkButton.setVisible(true);
            
            
    //         EggsButton.addActionListener(this);
    //         EggsButton.setBounds(150, 225, 75, 25);
    //         EggsButton.setVisible(true);
    
            
    //         cheeseButton.addActionListener(this);
    //         cheeseButton.setBounds(150, 300, 75, 25);
    //         cheeseButton.setVisible(true);
    
    
    //         ButtonGroup group1 = new ButtonGroup();
    //         group1.add(milkButton);
    //         group1.add(EggsButton);
    //         group1.add(cheeseButton);
    
    
    //         label2.setVerticalTextPosition(JLabel.TOP);
    //         label2.setFont(new Font(null, Font.ITALIC, 18));
    //         // label1.setIconTextGap(10);
    //         label2.setVerticalAlignment(JLabel.TOP);
    //         label2.setHorizontalTextPosition(JLabel.LEFT);
    //         label2.setBounds(0,0,250,100);
    //         panel1.add(label2);


    //         this.add(panel1);
    //         this.add(milkButton);
    //         this.add(EggsButton);
    //         this.add(cheeseButton);
    //         this.setSize(400, 250);
    //         this.setLayout(new FlowLayout());
    //         this.setVisible(true);
    //         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //         // this.setLayout(null);
    
    //     }
    // }


    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == breadsButton){
            breadProducts bp = new breadProducts();
        }
        else if(e.getSource() == dairyButton){
            this.dispose();
            dairyProduct dp = new dairyProduct();
        }
        else if(e.getSource() == vegeButton){
            vegetablesgui vegegui = new vegetablesgui();
        }
   
    }

}