
package linewithmouse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class draw extends JFrame implements MouseListener {
Point pt1,pt2;
    draw(){
        pt1=new Point();
        pt2=new Point();
        
        this.setSize(500,600);
        
        
        this.setBackground(Color.pink);
        this.setTitle("Drawing Line with Mouse");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseListener(this);
        
 
    }
    
    public void paint(Graphics g){
    
    Graphics2D g2=(Graphics2D)g;
    
    g2.setBackground(Color.yellow);
    g2.setColor(Color.red);
    g2.setStroke(new BasicStroke(4.0f));
    
    g2.drawLine(pt1.x, pt1.y, pt2.x, pt2.y);
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pt1.x=e.getX();
         pt1.y=e.getY();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        pt2.x=e.getX();
        pt2.y=e.getY();
       repaint();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   


}




public class LineWithMouse {

   
    public static void main(String[] args) {
        draw d=new draw();
    }
    
}
