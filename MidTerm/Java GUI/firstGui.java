/**
 * firstGui
 */
 import javax.swing.*;
public class firstGui {

    public static void main(String[] args) {
        JFrame f=new JFrame();   //object of jframe class and jbutton class
        JButton b=new JButton("click");
        
      b.setBounds(130,200,100,40);
      f.add(b);
      f.setSize(400,500);
      f.setLayout(null);
      
      f.setVisible(true);

    }
    
}