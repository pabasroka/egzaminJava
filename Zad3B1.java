// Zad3B1

import javax.swing.*;
import java.awt.*;

class Shape1 extends JPanel{
    public void paint(Graphics g){
        setSize(200,200);
        g.drawOval(25,25,150,150);
        g.drawLine(25,25,175,175);
        g.drawLine(25,175,175,25);
    }
}

public class Zad3B1 {
    private JPanel panelMain;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(225, 240);
        Shape ShapePanel = new Shape();
        frame.add(ShapePanel);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);
    }
}