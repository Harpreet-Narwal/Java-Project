import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vegetablesgui implements ActionListener{


    ImageIcon vegeimage = new ImageIcon("vege.png");
    JLabel label = new JLabel();
    // JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton appleButton = new JButton("Apple    Rs 45/Kg");
    JButton cbButton = new JButton("Cucubmer  Rs 20/kg");
    JButton mangoButton = new JButton("Mango    Rs 50/Kg");


    vegetablesgui(){

        // vegeimage.setVerticalAlignment(ImageIcon.)

        label.setText("Vegetables & Fruits ");
        // label.setIcon(vegeimage);
        label.setVisible(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(10);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(175,0,200, 100);



        
        appleButton.setBounds(200, 100, 150, 50);
        appleButton.addActionListener(this);



        cbButton.setBounds(200, 175, 150, 50);
        cbButton.addActionListener(this);


        mangoButton.setBounds(200, 250, 150, 50);
        mangoButton.addActionListener(this);



        // AppleButton.addActionListener(this);
        // AppleButton.setBounds(150, 150, 75, 25);
        // AppleButton.setVisible(true);
        
        
        // cucumberButton.addActionListener(this);
        // cucumberButton.setBounds(150, 250, 75, 25);
        // cucumberButton.setVisible(true);

        
        // MangoButton.addActionListener(this);
        // MangoButton.setBounds(150, 300, 75, 25);
        // MangoButton.setVisible(true);


        // ButtonGroup group1 = new ButtonGroup();
        // group1.add(AppleButton);
        // group1.add(cucumberButton);
        // group1.add(MangoButton);


        // label.setVerticalTextPosition(JLabel.TOP);
        // label.setFont(new Font(null, Font.ITALIC, 18));
        // // label1.setIconTextGap(10);
        // label.setVerticalAlignment(JLabel.TOP);
        // label.setHorizontalTextPosition(JLabel.LEFT);
        // label.setBounds(0,0,250,100);
        // panel.add(label);

        frame.add(appleButton);
        frame.add(cbButton);
        frame.add(mangoButton);
        // this.add(panel);
        // this.add(AppleButton);
        // this.add(cucumberButton);
        // this.add(MangoButton);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

    }


}