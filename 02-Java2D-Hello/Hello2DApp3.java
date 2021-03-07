import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp3 {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World Ben 10");
        this.setSize(350, 350);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        int[] x1 = {w / 2, w, 0};
        int[] y1 = {h / 2, h, h};
        int[] x2 = {w / 2, w, 0};
        int[] y2 = {h / 2, 0, 0};

        // mudando a cor de fundo //
        g2d.setPaint(Color.BLACK); // mudando a cor do contexto grafico
        g2d.fillRect(0, 0, w, h); // redesenhando fundo

        g2d.setPaint(Color.GREEN);
        g2d.fillPolygon(x1, y1, 3); // pintando primeiro triangulo
        g2d.fillPolygon(x2, y2, 3); // pintando segundo triangulo
    }
}