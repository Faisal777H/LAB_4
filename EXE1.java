import java.awt.*;

public class EXE1 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10);
        double perimeter=2*(box.getWidth()+ box.getHeight());
        System.out.println("THE expected output is 30 ");
        System.out.println("the actual perimeter "+perimeter);
    }
}
