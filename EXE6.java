import javax.swing.*;
import java.awt.*;

public class EXE6 extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        Rectangle box=new Rectangle(5,10,20,30);
        g2.setColor(Color.pink);
        g2.draw(box);
        Rectangle box2=new Rectangle(50,100,20,30);
        g2.setColor(new Color(255,0,255));
        g2.draw(box2);
    }

}
