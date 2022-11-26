import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener{


    //    this.setTitle("Jthis title goes here"); // sets title of this
    //    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
    //    this.setResizable(false);// prevent this from being resized.
    //    this.setSize(420,420); // sets the x-dimension, and y dimension of our this.
    //    this.setVisible(true);    // make this visible.
   
   
   
    //    // ImageIcon image = new ImageIcon("logo.png") // create an ImageIcon
    //    // this.setIconImage(image.getImage()); // change image of this.
   
    //    Color c1 = new Color(0xFFFFF);
   
    //    this.getContentPane().setBackground(c1); //change color of background.
 
    JButton button;

    JLabel label;

    MyFrame() {


        label =  new JLabel();
        label.setBounds(150, 50, 150, 150);
        label.setVisible(false);
        label.setText("Mommy!!");

        button = new JButton();
        button.setBounds(100, 100,250, 100);
        // button.addActionListener(e -> System.out.println("Poo"));
        button.addActionListener(this);
        button.setText("Budget Shoping");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);




    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            System.out.println("Poo");
        }
        
    }
        
}