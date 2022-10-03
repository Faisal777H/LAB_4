import javax.swing.*;

public class FRAME1 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("FRAME BOx1");
        f.setSize(500,500);
        EXE7 d=new EXE7();
        f.add(d);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
