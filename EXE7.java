import javax.swing.*;
import java.awt.*;

public class EXE7 extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2= (Graphics2D) g;
        Rectangle box=new Rectangle(5,10,200,20);
        g2.draw(box);
        g2.setColor(Color.BLUE);
        g2.fill(box);
        g2.setColor(Color.red);
        g2.drawString("Abobakr Alhomidy insta_user=(ar_ay_5)",10,25);
    }

}
