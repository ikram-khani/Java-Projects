import javax.swing.*;
import java.awt.*;




 class mygraphics extends JFrame {
    
     mygraphics(){
      
         
         
        this.setSize(400,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.yellow);
        this.setVisible(true);
         
       
        
    
     }
    
  
    public void paint (Graphics g)
            
            
    {
        Graphics2D g2=(Graphics2D)g;
       BasicStroke s=new BasicStroke(10.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        g2.setStroke(s);
        g2.drawLine(200, 100, 100, 50);
        
       
        
    
    }
 }
  public class myfirst{

    
    
   public static void main(String [] arg){
        mygraphics mg=new mygraphics();
       
   }
    
}
