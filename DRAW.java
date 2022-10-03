import javax.swing.*;

public class DRAW {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("FRAME BOX");
        f.setSize(500,500);
        EXE6 d=new EXE6();
        f.add(d);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
